public class Video0802 {
    public static void main(String[] args) {
        int Duracion;
        String Titulo;
        String URL;

        public Videos (){
        }
        public Videos (int Duracion, String Titulo, String URL){
            this.Duracion= Duracion;
            this.Titulo= Titulo;
            this.URL= URL;
        }
        public int getDuracion(){
            return Duracion;
        }
        public void setDuracion (int Duracion){
            this.Duracion= Duracion;
        }
        public String getTitulo(){
            return Titulo;
        }
        public void setTitulo (String Titulo){
            this.Titulo= Titulo;
        }
        public String getURL (){
            return URL;
        }
        public void setURL (String URL){
            this.URL= URL;
        }
    }
}