
public class Cajero {

	//VARIABLES
	private int numCuenta;
    private double saldo;
    
    
    //CONSTRUCTORES
    public Cajero() {
	}

    
	public Cajero(int numCuenta) {
        this.numCuenta = numCuenta;
        this.saldo = 0; // Saldo inicial por defecto
    }
	
	

    @Override
	public String toString() {
		return "Cajero [numCuenta=" + numCuenta + ", saldo=" + saldo + "]\n";
	}


	// Getters y setters
    public int getNumCuenta() {
        return numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    
    
}
