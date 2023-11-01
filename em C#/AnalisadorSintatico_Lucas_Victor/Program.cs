using AnalisadorSintatico;

Analisador analisador = new Analisador();
if (analisador.RealizaAnalise("bda"))
{
    Console.WriteLine("Valido");
}
else
{
    Console.WriteLine("Invalido");
}