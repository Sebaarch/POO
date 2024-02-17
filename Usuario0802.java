public class Usuario0802 {
    public static void main(String[] args) {
    String nombre;
    String videoSubido;
    
    public usuario () {
    }
    public usuario (String nombre){
        this.nombre= nombre;
    }
    public String getNombre (){
        return nombre;
    }
    public void setNombre (String nombre){
        this.nombre= nombre;
    }
    public videoSubido getVideosubido (){
        return videoSubido;
    }
    public void SubirVideo (videos video) {
        this. videoSubido= video;
    }
    public void MostrarInfoUsuario (){
        if (videoSubido != null) {
            System.out.println("Ultimo video subido " + videoSubido.getTitulo());
        } else {
            System.out.println("Aun no ha subido ningun video.");
        }
    }
}
}


