using AnalisadorSintatico;

Analisador analisador = new Analisador();

if (analisador.RealizaAnalise("bda"))
    Console.WriteLine("Válido");
else
    Console.WriteLine("Inválido");