package br.com.cdb.bancodigital.seguranca.utils;

public class ConstantUtils {

    public static final String INICIO_FILTRO_JWT = "Iniciando o filtro de autenticação JWT";
    public static final String HEATHER_AUTHORIZATION = "Authorization";
    public static final String HEADER_BEARER = "Bearer ";
    public static final String HEADER_AUTENTICACAO_ENCONTRADO = "Header de autenticação encontrado";
    public static final String PROCESSANDO_TOKEN = "Processando o token JWT";
    public static final String SUCESSO_TOKEN_PROCESSADO = "Token JWT processado com sucesso";
    public static final String TOKEN_EXPIRADO = "Token expirado";
    public static final String TOKEN_INVALIDO = "Token inválido";
    public static final String TOKEN_MALFORMADO = "Token malformado ou não suportado";
    public static final String ASSINATURA_INVALIDA = "Assinatura inválida do token";
    public static final String ERRO_AUTENTICACAO = "Erro ao autenticar o usuário";
    public static final String FIM_FILTRO_JWT = "Filtro de autenticação JWT finalizado";
    public static final String SECURITY_FILTER_CHAIN = "Configurando SecurityFilterChain";
    public static final String ROTAS_LIBERADAS = "/auth/**";
    public static final String ACESSO_PUBLICO = "Permitindo acesso público às rotas" + ROTAS_LIBERADAS + " e exigindo autenticação para outras rotas";
    public static final String POLITICA_SESSION_STATELESS = "Definindo política de sessão como STATELESS";
    public static final String SUCESSO_SECURITY_FILTER_CHAIN = "SecurityFilterChain configurado com sucesso";
    public static final String AUTENTICACAO_PROVIDER = "Criando AuthenticationProvider...";
    public static final String SUCESSO_AUTENTICACAO_PROVIDER = "AuthenticationProvider criado com sucesso";
    public static final String CRIANDO_PASSWORD_ENCODER = "Criando PasswordEncoder (BCryptPasswordEncoder)...";
    public static final String AUTHENTICACAO_MANAGER = "Criando AuthenticationManager...";
    public static final String INICIO_REGISTRAR = "Iniciando registro de novo usuário";
    public static final String SUCESSO_REGISTRAR = "Usuário registrado com sucesso";
    public static final String INICIO_AUTENTICACAO = "Iniciando autenticação de usuário";
    public static final String SUCESSO_AUTENTICACAO = "Usuário autenticado com sucesso";
    public static final String AUTENTICACAO = "/auth";
    public static final String SIGNIN = "/signin";
    public static final String LOGIN = "/login";
    public static final String FIM_CHAMADA = "Chamada concluída em {} ms.";
    public static final String USUARIO = "/usuario";
    public static final String DELETE_USUARIO = "/{id_usuario}";
    public static final String GET_USUARIO = "/me";
    public static final String ROLE_ADMIN = "hasRole('ADMIN')";
    public static final String INICIO_BUSCA_USUARIO = "Iniciando busca de usuário";
    public static final String SUCESSO_BUSCA_USUARIO = "Informações de usuário obtidas com sucesso";
    public static final String INICIO_DELETE_USUARIO = "Iniciando exclusão de usuário ID: {}";
    public static final String SUCESSO_DELETE_USUARIO = "Usuário excluído com sucesso ID: {}";
}
