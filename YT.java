public class YT {
    public static void main(String[] args) {
        Usuario usu1 = new Usuario("Sebas Chavez");
        Video vid1= new Video (6000,"Como tener novia","Https://youtube.com/comotenernovia");
        usu1.SubirVideo(vid1);
        usu1.MostrarInfoUsuario();
        System.out.println("---");
        
        Usuario usu2 = new Usuario ("VICTORRR");
        Comentario commt1 = new Comentario("ESTO ES BASURA", usu2);
        
        System.out.println("El usuario: " + usu2.getNombre() + "   Hizo este comentario: " + commt1.getContenido());
               
    }
}