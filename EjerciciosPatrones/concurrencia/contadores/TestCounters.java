package contadores;

public class TestCounters{
  public static void main(String[] args) {
        new CounterName(0, 1, 100, "- Contador A").start();
        new CounterName(0, -1, 100, "                Contador B:").start();
    }
}