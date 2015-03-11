/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.akuavida.integracion.jdbc;

import edu.co.sena.akuavida.integracion.dao.*;
import edu.co.sena.akuavida.integracion.factory.*;
import edu.co.sena.akuavida.integracion.dto.*;
import edu.co.sena.akuavida.integracion.exceptions.*;
import java.sql.Connection;
import java.util.Collection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class MunicipioDaoImpl extends AbstractDAO implements MunicipioDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT idMunicipio, Nombre_Municipio, Departamento_idDepartamento FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( idMunicipio, Nombre_Municipio, Departamento_idDepartamento ) VALUES ( ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET idMunicipio = ?, Nombre_Municipio = ?, Departamento_idDepartamento = ? WHERE idMunicipio = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE idMunicipio = ?";

	/** 
	 * Index of column idMunicipio
	 */
	protected static final int COLUMN_ID_MUNICIPIO = 1;

	/** 
	 * Index of column Nombre_Municipio
	 */
	protected static final int COLUMN_NOMBRE_MUNICIPIO = 2;

	/** 
	 * Index of column Departamento_idDepartamento
	 */
	protected static final int COLUMN_DEPARTAMENTO_IDDEPARTAMENTO = 3;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 3;

	/** 
	 * Index of primary-key column idMunicipio
	 */
	protected static final int PK_COLUMN_ID_MUNICIPIO = 1;

	/** 
	 * Inserts a new row in the municipio table.
	 */
	public MunicipioPk insert(Municipio dto) throws MunicipioDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			StringBuffer sql = new StringBuffer();
			StringBuffer values = new StringBuffer();
			sql.append( "INSERT INTO " + getTableName() + " (" );
			int modifiedCount = 0;
			if (dto.isIdMunicipioModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "idMunicipio" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isNombreMunicipioModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "Nombre_Municipio" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isDepartamentoIddepartamentoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "Departamento_idDepartamento" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (modifiedCount==0) {
				// nothing to insert
				throw new IllegalStateException( "Nothing to insert" );
			}
		
			sql.append( ") VALUES (" );
			sql.append( values );
			sql.append( ")" );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdMunicipioModified()) {
				stmt.setString( index++, dto.getIdMunicipio() );
			}
		
			if (dto.isNombreMunicipioModified()) {
				stmt.setString( index++, dto.getNombreMunicipio() );
			}
		
			if (dto.isDepartamentoIddepartamentoModified()) {
				stmt.setString( index++, dto.getDepartamentoIddepartamento() );
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new MunicipioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the municipio table.
	 */
	public void update(MunicipioPk pk, Municipio dto) throws MunicipioDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			StringBuffer sql = new StringBuffer();
			sql.append( "UPDATE " + getTableName() + " SET " );
			boolean modified = false;
			if (dto.isIdMunicipioModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "idMunicipio=?" );
				modified=true;
			}
		
			if (dto.isNombreMunicipioModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "Nombre_Municipio=?" );
				modified=true;
			}
		
			if (dto.isDepartamentoIddepartamentoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "Departamento_idDepartamento=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE idMunicipio=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdMunicipioModified()) {
				stmt.setString( index++, dto.getIdMunicipio() );
			}
		
			if (dto.isNombreMunicipioModified()) {
				stmt.setString( index++, dto.getNombreMunicipio() );
			}
		
			if (dto.isDepartamentoIddepartamentoModified()) {
				stmt.setString( index++, dto.getDepartamentoIddepartamento() );
			}
		
			stmt.setString( index++, pk.getIdMunicipio() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new MunicipioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the municipio table.
	 */
	public void delete(MunicipioPk pk) throws MunicipioDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_DELETE + " with PK: " + pk );
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setString( 1, pk.getIdMunicipio() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new MunicipioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the municipio table that matches the specified primary-key value.
	 */
	public Municipio findByPrimaryKey(MunicipioPk pk) throws MunicipioDaoException
	{
		return findByPrimaryKey( pk.getIdMunicipio() );
	}

	/** 
	 * Returns all rows from the municipio table that match the criteria 'idMunicipio = :idMunicipio'.
	 */
	public Municipio findByPrimaryKey(String idMunicipio) throws MunicipioDaoException
	{
		Municipio ret[] = findByDynamicSelect( SQL_SELECT + " WHERE idMunicipio = ?", new Object[] { idMunicipio } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the municipio table that match the criteria ''.
	 */
	public Municipio[] findAll() throws MunicipioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY idMunicipio", null );
	}

	/** 
	 * Returns all rows from the municipio table that match the criteria 'Departamento_idDepartamento = :departamentoIddepartamento'.
	 */
	public Municipio[] findByDepartamento(String departamentoIddepartamento) throws MunicipioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Departamento_idDepartamento = ?", new Object[] { departamentoIddepartamento } );
	}

	/** 
	 * Returns all rows from the municipio table that match the criteria 'idMunicipio = :idMunicipio'.
	 */
	public Municipio[] findWhereIdMunicipioEquals(String idMunicipio) throws MunicipioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE idMunicipio = ? ORDER BY idMunicipio", new Object[] { idMunicipio } );
	}

	/** 
	 * Returns all rows from the municipio table that match the criteria 'Nombre_Municipio = :nombreMunicipio'.
	 */
	public Municipio[] findWhereNombreMunicipioEquals(String nombreMunicipio) throws MunicipioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Nombre_Municipio = ? ORDER BY Nombre_Municipio", new Object[] { nombreMunicipio } );
	}

	/** 
	 * Returns all rows from the municipio table that match the criteria 'Departamento_idDepartamento = :departamentoIddepartamento'.
	 */
	public Municipio[] findWhereDepartamentoIddepartamentoEquals(String departamentoIddepartamento) throws MunicipioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Departamento_idDepartamento = ? ORDER BY Departamento_idDepartamento", new Object[] { departamentoIddepartamento } );
	}

	/**
	 * Method 'MunicipioDaoImpl'
	 * 
	 */
	public MunicipioDaoImpl()
	{
	}

	/**
	 * Method 'MunicipioDaoImpl'
	 * 
	 * @param userConn
	 */
	public MunicipioDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows)
	{
		this.maxRows = maxRows;
	}

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows()
	{
		return maxRows;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "akuavida.municipio";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Municipio fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Municipio dto = new Municipio();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Municipio[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Municipio dto = new Municipio();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Municipio ret[] = new Municipio[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Municipio dto, ResultSet rs) throws SQLException
	{
		dto.setIdMunicipio( rs.getString( COLUMN_ID_MUNICIPIO ) );
		dto.setNombreMunicipio( rs.getString( COLUMN_NOMBRE_MUNICIPIO ) );
		dto.setDepartamentoIddepartamento( rs.getString( COLUMN_DEPARTAMENTO_IDDEPARTAMENTO ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Municipio dto)
	{
		dto.setIdMunicipioModified( false );
		dto.setNombreMunicipioModified( false );
		dto.setDepartamentoIddepartamentoModified( false );
	}

	/** 
	 * Returns all rows from the municipio table that match the specified arbitrary SQL statement
	 */
	public Municipio[] findByDynamicSelect(String sql, Object[] sqlParams) throws MunicipioDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new MunicipioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the municipio table that match the specified arbitrary SQL statement
	 */
	public Municipio[] findByDynamicWhere(String sql, Object[] sqlParams) throws MunicipioDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = SQL_SELECT + " WHERE " + sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new MunicipioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

}
