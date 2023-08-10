

    public class Carro {
        private String marca;    //Variavel Global
        private String modelo;
        private String cor;
        private String placa;

        Carro(){                         //CONSTRUTOR
            cor="Prata";
            marca="Fiat";
            modelo="Sedan";
            placa="ABC123";
        }

        Carro(String marca, String modelo, String cor, String placa){         //CONSTRUTOR
            this.marca=marca;
            this.modelo=modelo;
            this.placa=placa;
            this.cor=cor;
        }

        void setMarca(String marca){
            this.marca=marca; //Variavel global recebe a variavel local.
        }
        String getMarca(){
            return(marca);
        }

        void setModelo(String modelo){
            this.modelo=modelo;
        }
        String getModelo(){
            return(modelo);
        }

        void setCor(String cor){
            this.cor=cor;
        }
        String getCor(){
            return(cor);
        }

        void setPlaca(String placa){
            this.placa=placa;
        }
        String getPlaca(){
            return(placa);
        }

        void printCar() {
            System.out.println(marca);
            System.out.println(cor);
            System.out.println(placa);
            System.out.println(modelo);
        }
    }


