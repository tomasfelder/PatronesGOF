package contadores;

public class CounterName extends Thread {

    protected int count;
    protected int inc;
    protected int delay;
	protected String nombre;

    public CounterName( int  init,  int  inc,  int  delay, String n ) {
        this.count = init;
        this.inc = inc;
        this.delay = delay;
		this.nombre = n;
    }


    public void run() {
        try {
			while(true){ 
                System.out.println(nombre+":"+count + " ");
                count += inc;
                sleep(delay);
            }
        } catch (InterruptedException e) {}
    }

  
}