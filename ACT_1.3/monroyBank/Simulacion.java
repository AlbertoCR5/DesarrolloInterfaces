package monroyBank;

public class Simulacion {

	public static void main(String[] args) {

		try {
			ICuentaCorriente cc = new CuentaCorriente("Nabil Fekir","3245987613",5400700);
			IFechaDeCaducidad f = new FechaDeCaducidad(10, 2025);
			ITarjetaVirtual v = new TarjetaVirtual(cc.getTitular(), cc.getNumero(), cc.getSaldo(), f, 600, 1234);
			((TarjetaVirtual) v).cambiarPin(1234, 9999, 9999);
			((TarjetaVirtual) v).recargarMonedero(700, 9999);
			((TarjetaVirtual) v).compra(65, 9999);
			System.out.println("Compra realizada con exito!" + "\n");
			System.out.println(v.toString());
		} catch (CuentaCorrienteMonroyException e) {
			System.out.println(e.getMessage());
			System.out.println("No se ha podido realizar la compra.");
		}

	}

}
