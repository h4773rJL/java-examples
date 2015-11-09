import java.lang.Thread;

public class Hilos extends Thread{ //nombre de la clase
   String mensaje;
      public Hilos (String msg)   //Consctructor de la clase
         {
            super (msg);
         }
      public void run()
         {
         for (int i=0; i<15; i++)
            {
               System.out.println(mensaje);
            }
            
            System.out.println("Este proceso ha terminado;"+this.getName());
            
         }
      public void setMesaje(String msj) //Metodo de la clase que se configura el mensaje
         {
			 this.mensaje=msj;
		 }
		 
	public static void main(String[] args){
		// TODO code applicantion logic here
		Hilos hilo1=new Hilos("Proceso 1"); // Creación del objeto hilos1 de la clase Hilos
		Hilos hilo2=new Hilos("Proceso 2"); // Creacion del objeto hilos2 de la calse Hilos
		hilo1.setMesaje("Este es el mensaje de proceso 1"); //mensaje para el hilo1
		hilo2.setMesaje("Mensaje proceso 2"); //Mensaje para el hilo 2		
		hilo1.start(); //inicio del hilo1 con el metodo start() heredado de la clase Thread
		//hilo2.setPriority(01); //establezco una prioridad 1
		hilo2.start(); //inicio del hilo2 con el metodo start() heredado de la clase Thread
		/*try{
		    hilo1.sleep(1*10*1000); // Duerme durante 1 minuto
		    }catch(InterruptedException ex){}
		  */		   
	 }
 }	           
         
