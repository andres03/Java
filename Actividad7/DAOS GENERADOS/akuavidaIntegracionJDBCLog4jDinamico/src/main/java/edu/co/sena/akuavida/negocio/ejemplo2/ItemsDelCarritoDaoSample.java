/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.akuavida.negocio.ejemplo2;

import edu.co.sena.akuavida.negocio.example.*;
import java.math.*;
import java.util.Date;
import java.util.Collection;
import edu.co.sena.akuavida.integracion.dao.ItemsDelCarritoDao;
import edu.co.sena.akuavida.integracion.dto.ItemsDelCarrito;
import edu.co.sena.akuavida.integracion.exceptions.ItemsDelCarritoDaoException;
import edu.co.sena.akuavida.integracion.factory.ItemsDelCarritoDaoFactory;

public class ItemsDelCarritoDaoSample
{
	/**
	 * Method 'main'
	 * 
	 * @param arg
	 * @throws Exception
	 */
	public static void main(String[] arg) throws Exception
	{
		// Uncomment one of the lines below to test the generated code
		
		// findAll();
		// findByCarritoDeCompras("");
		// findByProducto("");
		// findWhereProductoIdProductoEquals("");
		// findWhereCantidadEquals(0);
		// findWhereCostoUnitarioEquals(0);
		// findWhereCostoTotalEquals(0);
		// findWhereCarritoDeComprasIdCarritoEquals("");
            
            ItemsDelCarrito itemC1 = new ItemsDelCarrito();
            itemC1.setProductoIdProducto("01");
            itemC1.setCantidad(6);
            itemC1.setCostoUnitario(160000);
            itemC1.setCostoTotal(0);
            itemC1.setCarritoDeComprasIdCarrito("123fghjk78");
            
            ItemsDelCarritoDao itemCDao =getItemsDelCarritoDao();
            itemCDao.insert(itemC1);
            System.out.println("Se inserto el item del carrito");
            itemC1.setCantidad(7);
            itemCDao.update(itemC1.createPk(), itemC1);
            System.out.println("Se actualizo los datos");
            findAll();
            
            
            
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			ItemsDelCarritoDao _dao = getItemsDelCarritoDao();
			ItemsDelCarrito _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByCarritoDeCompras'
	 * 
	 * @param carritoDeComprasIdCarrito
	 */
	public static void findByCarritoDeCompras(String carritoDeComprasIdCarrito)
	{
		try {
			ItemsDelCarritoDao _dao = getItemsDelCarritoDao();
			ItemsDelCarrito _result[] = _dao.findByCarritoDeCompras(carritoDeComprasIdCarrito);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByProducto'
	 * 
	 * @param productoIdProducto
	 */
	public static void findByProducto(String productoIdProducto)
	{
		try {
			ItemsDelCarritoDao _dao = getItemsDelCarritoDao();
			ItemsDelCarrito _result[] = _dao.findByProducto(productoIdProducto);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereProductoIdProductoEquals'
	 * 
	 * @param productoIdProducto
	 */
	public static void findWhereProductoIdProductoEquals(String productoIdProducto)
	{
		try {
			ItemsDelCarritoDao _dao = getItemsDelCarritoDao();
			ItemsDelCarrito _result[] = _dao.findWhereProductoIdProductoEquals(productoIdProducto);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereCantidadEquals'
	 * 
	 * @param cantidad
	 */
	public static void findWhereCantidadEquals(int cantidad)
	{
		try {
			ItemsDelCarritoDao _dao = getItemsDelCarritoDao();
			ItemsDelCarrito _result[] = _dao.findWhereCantidadEquals(cantidad);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereCostoUnitarioEquals'
	 * 
	 * @param costoUnitario
	 */
	public static void findWhereCostoUnitarioEquals(float costoUnitario)
	{
		try {
			ItemsDelCarritoDao _dao = getItemsDelCarritoDao();
			ItemsDelCarrito _result[] = _dao.findWhereCostoUnitarioEquals(costoUnitario);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereCostoTotalEquals'
	 * 
	 * @param costoTotal
	 */
	public static void findWhereCostoTotalEquals(float costoTotal)
	{
		try {
			ItemsDelCarritoDao _dao = getItemsDelCarritoDao();
			ItemsDelCarrito _result[] = _dao.findWhereCostoTotalEquals(costoTotal);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereCarritoDeComprasIdCarritoEquals'
	 * 
	 * @param carritoDeComprasIdCarrito
	 */
	public static void findWhereCarritoDeComprasIdCarritoEquals(String carritoDeComprasIdCarrito)
	{
		try {
			ItemsDelCarritoDao _dao = getItemsDelCarritoDao();
			ItemsDelCarrito _result[] = _dao.findWhereCarritoDeComprasIdCarritoEquals(carritoDeComprasIdCarrito);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getItemsDelCarritoDao'
	 * 
	 * @return ItemsDelCarritoDao
	 */
	public static ItemsDelCarritoDao getItemsDelCarritoDao()
	{
		return ItemsDelCarritoDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(ItemsDelCarrito dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getProductoIdProducto() );
		buf.append( ", " );
		buf.append( dto.getCantidad() );
		buf.append( ", " );
		buf.append( dto.getCostoUnitario() );
		buf.append( ", " );
		buf.append( dto.getCostoTotal() );
		buf.append( ", " );
		buf.append( dto.getCarritoDeComprasIdCarrito() );
		System.out.println( buf.toString() );
	}

}
