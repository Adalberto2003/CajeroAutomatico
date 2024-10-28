
public interface Metodos {

	public void altaCliente(int numCuenta);
	
    public void consultarSaldo(int numCuenta);
    
    public void deposito(int numCuenta, double monto);
    
    public void retiro(int numCuenta, double monto);
}
