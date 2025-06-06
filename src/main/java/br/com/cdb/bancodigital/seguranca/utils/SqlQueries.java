package br.com.cdb.bancodigital.seguranca.utils;

public class SqlQueries {

    public static final String SQL_CREATE_USUARIO = "SELECT * FROM public.add_usu_v1(?, ?, ?)";
    public static final String SQL_EXIST_USUARIO_BY_EMAIL = "SELECT public.ext_usu_ema_v1(?)";
    public static final String SQL_READ_USUARIO_BY_EMAIL = "SELECT * FROM public.lst_usu_ema_v1(?)";
    public static final String SQL_READ_USUARIO_BY_ID = "SELECT * FROM public.lst_usu_id_v1(?)";
    public static final String SQL_UPDATE_USUARIO = "SELECT public.upd_usu_v1(?, ?, ?, ?)";
    public static final String SQL_DELETE_USUARIO = "SELECT public.dlt_usu_v1(?)";

}
