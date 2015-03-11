/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.akuavida.integracion.dto;


import java.io.Serializable;

public class CarritoDeCompras implements Serializable
{
	/** 
	 * This attribute maps to the column ID_Carrito in the carrito_de_compras table.
	 */
	protected String idCarrito;

	/** 
	 * This attribute maps to the column Total in the carrito_de_compras table.
	 */
	protected float total;

	/** 
	 * This attribute maps to the column Subtotal in the carrito_de_compras table.
	 */
	protected float subtotal;

	/**
	 * Method 'CarritoDeCompras'
	 * 
	 */
	public CarritoDeCompras()
	{
	}

	/**
	 * Method 'getIdCarrito'
	 * 
	 * @return String
	 */
	public String getIdCarrito()
	{
		return idCarrito;
	}

	/**
	 * Method 'setIdCarrito'
	 * 
	 * @param idCarrito
	 */
	public void setIdCarrito(String idCarrito)
	{
		this.idCarrito = idCarrito;
	}

	/**
	 * Method 'getTotal'
	 * 
	 * @return float
	 */
	public float getTotal()
	{
		return total;
	}

	/**
	 * Method 'setTotal'
	 * 
	 * @param total
	 */
	public void setTotal(float total)
	{
		this.total = total;
	}

	/**
	 * Method 'getSubtotal'
	 * 
	 * @return float
	 */
	public float getSubtotal()
	{
		return subtotal;
	}

	/**
	 * Method 'setSubtotal'
	 * 
	 * @param subtotal
	 */
	public void setSubtotal(float subtotal)
	{
		this.subtotal = subtotal;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
        @Override
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof CarritoDeCompras)) {
			return false;
		}
		
		final CarritoDeCompras _cast = (CarritoDeCompras) _other;
		if (idCarrito == null ? _cast.idCarrito != idCarrito : !idCarrito.equals( _cast.idCarrito )) {
			return false;
		}
		
		if (total != _cast.total) {
			return false;
		}
		
		if (subtotal != _cast.subtotal) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
        @Override
	public int hashCode()
	{
		int _hashCode = 0;
		if (idCarrito != null) {
			_hashCode = 29 * _hashCode + idCarrito.hashCode();
		}
		
		_hashCode = 29 * _hashCode + Float.floatToIntBits(total);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(subtotal);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return CarritoDeComprasPk
	 */
	public CarritoDeComprasPk createPk()
	{
		return new CarritoDeComprasPk(idCarrito);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
        @Override
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.akuavida.integracion.dto.CarritoDeCompras: " );
		ret.append( "idCarrito=" + idCarrito );
		ret.append( ", total=" + total );
		ret.append( ", subtotal=" + subtotal );
		return ret.toString();
	}

}