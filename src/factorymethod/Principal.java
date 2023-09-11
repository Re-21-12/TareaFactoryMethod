package factorymethod;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FabricaProducto fabrica;
		fabrica = new FabricaProductoMesa();
		IFabricaProducto mesa = fabrica.crearMueble();
		mesa.armarMueble();

		fabrica = new FabricaProductoSilla();
		IFabricaProducto silla = fabrica.crearMueble();
		silla.armarMueble();

	}

}
