public class Youtube {
    public static void main(String[] args) {
        Usuario usu1= new Usuario0802 ("Sebastian Chávez");
        Videos vid1= new Video0802 (6000, "Como cerrar los ojos", "www.cierratusojos.com");
        usu1.SubirVideo(vid1);
        usu1.MostrarInfoUsuario();
    }
}