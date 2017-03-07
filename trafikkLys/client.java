public class client
{
    public void clientMethod()
    {
        SteinSaksPapir spill = new SteinSaksPapir("Stein");
        SteinSaksPapir spill2 = new SteinSaksPapir();
        
        spill2.setBrukerGjett("papir");
        
        System.out.println("Spill har " + spill.vinn());
        System.out.println("Spill2 har " + spill2.vinn());
    }
    
}
