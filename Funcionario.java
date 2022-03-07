public class Funcionario {

    //DEFININDO OS ATRIBUTOS
        public String nome;
        public double valorPorHora;
        public int horas;
        
    //DEFININDO METODOS
        public double total() {
            return (valorPorHora * horas);
        }
}
