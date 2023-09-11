package factorymethod;

public  class FabricaProductoSilla extends FabricaProducto {
@Override
IFabricaProducto crearMueble() {
	// TODO Auto-generated method stub
	return new Silla();
}
}
