namespace AnalisadorSintatico
{
    internal class Analisador
    {
        private Stack<char> pilha = new Stack<char>();
        private string input;
        private int indiceAtual;

        private List<char> terminais = new List<char>() { 'a', 'b', 'd' };
        private List<char> variaveis = new List<char>() { 'S', 'A', 'B', 'D' };

        private string[,] tabelaTransicoes =
        {
            { "Aa", "Aa", "Aa" },       // S
            { "", "BD", "BD" },         // A
            { "-",  "b", "" },          // B
            { "",  "-", "d" },          // D
        };

        public bool RealizaAnalise(string input)
        {
            IniciaAnalisador(input);
            return ValidaInput();
        }

        private void IniciaAnalisador(string input)
        {
            pilha.Clear();
            pilha.Push('S');

            indiceAtual = 0;
            this.input = input.ToLower();
        }

        private bool ValidaInput()
        {
            char simboloAtual;

            int posVariavel;
            int posTerminal;
            string valorEmpilhar;

            while(pilha.Count > 0)
            {
                simboloAtual = pilha.Pop();

                if (VerificaSeContem(simboloAtual, terminais))
                {
                    // Se o símbolo que estava no topo da pilha for terminal, ele obrigatoriamente deve ser igual do indice atual
                    if (indiceAtual >= input.Length || input[indiceAtual] != simboloAtual)
                        return false;

                    // Avanço o cursor
                    indiceAtual++;
                }
                else if (VerificaSeContem(simboloAtual, variaveis))
                {
                    // Válido quais simbolos serão empilhados no seu lugar a partir do input atual
                    posVariavel = RetornaPosicaoLista(simboloAtual, variaveis);

                    // Se eu já tiver terminado meu input, pego a posição do fim da pilha ($)
                    if (indiceAtual >= input.Length)
                        posTerminal = tabelaTransicoes.GetLength(1) - 1;
                    else
                        posTerminal = RetornaPosicaoLista(input[indiceAtual], terminais);

                    if (posTerminal == -1)
                        return false;

                    valorEmpilhar = tabelaTransicoes[posVariavel, posTerminal];

                    if(valorEmpilhar == "-")
                        return false;

                    for (int i = valorEmpilhar.Length - 1; i >= 0; i--)
                        pilha.Push(valorEmpilhar[i]);
                }
                else
                {
                    return false;
                }
            }

            return indiceAtual == input.Length;
        }

        private bool VerificaSeContem(char simbolo, List<char> lista)
        {
            return lista.Contains(simbolo);
        }

        private int RetornaPosicaoLista(char simbolo, List<char> lista)
        {
            return lista.IndexOf(simbolo);
        }
    }
}