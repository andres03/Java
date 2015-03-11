/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.akuavida.integracion.dto;

import edu.co.sena.akuavida.integracion.dao.*;
import edu.co.sena.akuavida.integracion.factory.*;
import edu.co.sena.akuavida.integracion.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class Departamento implements Serializable
{
	/** 
	 * This attribute maps to the column idDepartamento in the departamento table.
	 */
	protected String idDepartamento;

	/** 
	 * This attribute represents whether the attribute idDepartamento has been modified since being read from the database.
	 */
	protected boolean idDepartamentoModified = false;

	/** 
	 * This attribute maps to the column Nombre_Departamento in the departamento table.
	 */
	protected String nombreDepartamento;

	/** 
	 * This attribute represents whether the attribute nombreDepartamento has been modified since being read from the database.
	 */
	protected boolean nombreDepartamentoModified = false;

	/**
	 * Method 'Departamento'
	 * 
	 */
	public Departamento()
	{
	}

	/**
	 * Method 'getIdDepartamento'
	 * 
	 * @return String
	 */
	public String getIdDepartamento()
	{
		return idDepartamento;
	}

	/**
	 * Method 'setIdDepartamento'
	 * 
	 * @param idDepartamento
	 */
	public void setIdDepartamento(String idDepartamento)
	{
		this.idDepartamento = idDepartamento;
		this.idDepartamentoModified = true;
	}

	/** 
	 * Sets the value of idDepartamentoModified
	 */
	public void setIdDepartamentoModified(boolean idDepartamentoModified)
	{
		this.idDepartamentoModified = idDepartamentoModified;
	}

	/** 
	 * Gets the value of idDepartamentoModified
	 */
	public boolean isIdDepartamentoModified()
	{
		return idDepartamentoModified;
	}

	/**
	 * Method 'getNombreDepartamento'
	 * 
	 * @return String
	 */
	public String getNombreDepartamento()
	{
		return nombreDepartamento;
	}

	/**
	 * Method 'setNombreDepartamento'
	 * 
	 * @param nombreDepartamento
	 */
	public void setNombreDepartamento(String nombreDepartamento)
	{
		this.nombreDepartamento = nombreDepartamento;
		this.nombreDepartamentoModified = true;
	}

	/** 
	 * Sets the value of nombreDepartamentoModified
	 */
	public void setNombreDepartamentoModified(boolean nombreDepartamentoModified)
	{
		this.nombreDepartamentoModified = nombreDepartamentoModified;
	}

	/** 
	 * Gets the value of nombreDepartamentoModified
	 */
	public boolean isNombreDepartamentoModified()
	{
		return nombreDepartamentoModified;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof Departamento)) {
			return false;
		}
		
		final Departamento _cast = (Departamento) _other;
		if (idDepartamento == null ? _cast.idDepartamento != idDepartamento : !idDepartamento.equals( _cast.idDepartamento )) {
			return false;
		}
		
		if (idDepartamentoModified != _cast.idDepartamentoModified) {
			return false;
		}
		
		if (nombreDepartamento == null ? _cast.nombreDepartamento != nombreDepartamento : !nombreDepartamento.equals( _cast.nombreDepartamento )) {
			return false;
		}
		
		if (nombreDepartamentoModified != _cast.nombreDepartamentoModified) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		if (idDepartamento != null) {
			_hashCode = 29 * _hashCode + idDepartamento.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (idDepartamentoModified ? 1 : 0);
		if (nombreDepartamento != null) {
			_hashCode = 29 * _hashCode + nombreDepartamento.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (nombreDepartamentoModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return DepartamentoPk
	 */
	public DepartamentoPk createPk()
	{
		return new DepartamentoPk(idDepartamento);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.akuavida.integracion.dto.Departamento: " );
		ret.append( "idDepartamento=" + idDepartamento );
		ret.append( ", nombreDepartamento=" + nombreDepartamento );
		return ret.toString();
	}

}