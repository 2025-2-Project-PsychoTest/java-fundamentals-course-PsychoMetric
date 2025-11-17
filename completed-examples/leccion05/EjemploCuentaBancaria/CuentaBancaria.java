

public class CuentaBancaria {
    private String titular;
    private double saldo;
    private String numeroCuenta;
    
    public CuentaBancaria(String titular, String numeroCuenta) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
    }
    
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo = saldo + cantidad;
            System.out.println("✓ Depósito exitoso de $" + cantidad);
            System.out.println("Nuevo saldo: $" + saldo);
        } else {
            System.out.println("✗ Cantidad inválida");
        }
    }
    
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo = saldo - cantidad;
            System.out.println("✓ Retiro exitoso de $" + cantidad);
            System.out.println("Nuevo saldo: $" + saldo);
        } else if (cantidad > saldo) {
            System.out.println("✗ Saldo insuficiente");
        } else {
            System.out.println("✗ Cantidad inválida");
        }
    }
    
    public void consultarSaldo() {
        System.out.println("\n=== ESTADO DE CUENTA ===");
        System.out.println("Titular: " + titular);
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo actual: $" + saldo);
    }
    
    public double getSaldo() {
        return saldo;
    }
}

