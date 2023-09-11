package factorymethod;

public  class FabricaProductoMesa extends FabricaProducto{
@Override
IFabricaProducto crearMueble() {
	// TODO Auto-generated method stub
	return new Mesa ();
}
}
