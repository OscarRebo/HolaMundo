public class URL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String direccion = "https://www.ui1.es/";
try
                {
                    Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + direccion);
                }
                catch(Exception err)
                {
                    
                }
        
    }
    
}
