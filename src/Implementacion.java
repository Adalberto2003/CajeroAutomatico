import java.util.ArrayList;
import java.util.List;


public class Implementacion implements Metodos{

	private List<Cajero> clientes = new ArrayList<>();

	// Método para dar de alta a un cliente
    @Override
    public void altaCliente(int numCuenta) {
        // Validar si la cuenta ya existe en la lista
        if (buscarCliente(numCuenta) != null) {
            System.out.println("Error: El número de cuenta ya existe.");
        } else {
            clientes.add(new Cajero(numCuenta));
            System.out.println("Cliente con cuenta " + numCuenta + " ha sido dado de alta.");
        }
    }

    // Método para consultar saldo
    @Override
    public void consultarSaldo(int numCuenta) {
        Cajero cliente = buscarCliente(numCuenta);
        if (cliente != null) {
            System.out.println("Saldo actual: $" + cliente.getSaldo());
        } else {
            System.out.println("Error: Cuenta no encontrada.");
        }
    }

    // Método para realizar un depósito
    @Override
    public void deposito(int numCuenta, double monto) {
        Cajero cliente = buscarCliente(numCuenta);
        if (cliente != null) {
            if (monto > 0 && monto <= 10000) {
                cliente.setSaldo(cliente.getSaldo() + monto);
                System.out.println("Depósito realizado. Saldo actual: $" + cliente.getSaldo());
            } else {
                System.out.println("Error: El monto debe ser mayor a 0 y menor o igual a $10,000.");
            }
        } else {
            System.out.println("Error: Cuenta no encontrada.");
        }
    }

    // Método para realizar un retiro
    @Override
    public void retiro(int numCuenta, double monto) {
        Cajero cliente = buscarCliente(numCuenta);
        if (cliente != null) {
            if (monto > 0 && monto <= 10000) {
                if (cliente.getSaldo() >= monto) {
                    cliente.setSaldo(cliente.getSaldo() - monto);
                    System.out.println("Retiro realizado. Saldo actual: $" + cliente.getSaldo());
                } else {
                    System.out.println("Error: Fondos insuficientes.");
                }
            } else {
                System.out.println("Error: El monto debe ser mayor a 0 y menor o igual a $10,000.");
            }
        } else {
            System.out.println("Error: Cuenta no encontrada.");
        }
    }

    // Método para buscar un cliente en la lista
    private Cajero buscarCliente(int numCuenta) {
        for (Cajero cliente : clientes) {
            if (cliente.getNumCuenta() == numCuenta) {
                return cliente;
            }
        }
        return null; // Si no se encuentra el cliente
    }
	
}
