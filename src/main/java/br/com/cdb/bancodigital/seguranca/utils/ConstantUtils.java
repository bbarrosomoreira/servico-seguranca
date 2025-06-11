package br.com.cdb.bancodigital.seguranca.utils;

public class ConstantUtils {

    private ConstantUtils() {
        throw new IllegalStateException("Utility class");
    }

    // Banco de Dados
    public static final String INICIO_CONEXAO_BANCO = "Iniciando conexão com o banco de dados";
    public static final String SUCESSO_CONEXAO_BANCO = "Conexão com o banco de dados estabelecida com sucesso";
    public static final String ERRO_CONEXAO_BANCO = "Erro ao estabelecer conexão com o banco de dados";

    // Autenticação e Autorização
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

    // AuthService
    public static final String LOG_VERIFICANDO_EMAIL_CADASTRADO = "Verificando se o e-mail já está cadastrado";
    public static final String LOG_EMAIL_JA_CADASTRADO = "E-mail já cadastrado";
    public static final String EXC_EMAIL_JA_CADASTRADO = "E-mail já cadastrado";
    public static final String LOG_EMAIL_DISPONIVEL = "E-mail disponível";
    public static final String LOG_CRIANDO_NOVO_USUARIO = "Criando novo usuário";
    public static final String LOG_USUARIO_CRIADO_SUCESSO = "Usuário criado com sucesso";
    public static final String LOG_GERANDO_TOKEN = "Gerando token";
    public static final String LOG_TOKEN_GERADO_SUCESSO = "Token gerado com sucesso";
    public static final String LOG_ERRO_GERAR_TOKEN_ARG = "Erro ao gerar token: argumento inválido";
    public static final String EXC_ERRO_GERAR_TOKEN_ARG = "Erro ao gerar token: argumento inválido.";
    public static final String LOG_ERRO_GERAR_TOKEN_JWT = "Erro ao gerar token JWT";
    public static final String EXC_ERRO_GERAR_TOKEN_JWT = "Erro ao gerar token JWT.";
    public static final String LOG_ERRO_INESPERADO_AUTENTICAR = "Erro inesperado ao autenticar usuário";
    public static final String EXC_ERRO_INESPERADO_AUTENTICAR = "Erro inesperado ao autenticar usuário.";
    public static final String LOG_AUTENTICANDO_USUARIO = "Autenticando usuário";
    public static final String LOG_USUARIO_AUTENTICADO_SUCESSO = "Usuário autenticado com sucesso";
    public static final String LOG_BUSCANDO_USUARIO_BANCO = "Buscando usuário no banco de dados";
    public static final String LOG_USUARIO_ENCONTRADO_SUCESSO = "Usuário encontrado com sucesso";

    // JwtService
    public static final String JWT_GERANDO_TOKEN = "Iniciando geração de token para o usuário.";
    public static final String JWT_TOKEN_GERADO_SUCESSO = "Token gerado com sucesso.";
    public static final String JWT_EXTRAINDO_USERNAME = "Extraindo username do token.";
    public static final String JWT_EXTRAINDO_CLAIM = "Extraindo claim do token.";
    public static final String JWT_EXTRAINDO_TODOS_CLAIMS = "Extraindo todos os claims do token.";
    public static final String JWT_VALIDANDO_TOKEN = "Validando token para o usuário.";
    public static final String JWT_TOKEN_VALIDO = "Token válido.";
    public static final String JWT_TOKEN_INVALIDO = "Token inválido.";
    public static final String JWT_TOKEN_EXPIRADO = "Token expirado.";
    public static final String JWT_EXTRAINDO_EXPIRACAO = "Extraindo data de expiração do token.";

    // Roles
    public static final String ROLE_ADMIN = "hasRole('ADMIN')";

    // Endpoints
    public static final String USUARIO = "/usuario";
    public static final String DELETE_USUARIO = "/{id_usuario}";
    public static final String AUTENTICACAO = "/auth";
    public static final String GET_USUARIO = "/me";
    public static final String SIGNIN = "/signin";
    public static final String LOGIN = "/login";

    // Gerais
    public static final String FIM_CHAMADA = "Chamada concluída em {} ms.";
    public static final String RETORNO_VAZIO = "Retornando Optional.empty()";
    public static final String ERRO_UPDATE = "Atualização não concluída. Nenhuma linha foi afetada.";
    public static final String ERRO_DELETE = "Exclusão não concluída. Nenhuma linha foi afetada.";

    // Usuário
    public static final String INICIO_BUSCA_USUARIO = "Iniciando busca de usuário";
    public static final String SUCESSO_BUSCA_USUARIO = "Informações de usuário obtidas com sucesso";
    public static final String USUARIO_ENCONTRADO = "Usuário encontrado com sucesso";
    public static final String ERRO_BUSCA_USUARIO = "Usuário não encontrado.";
    public static final String ERRO_USUARIO_NULO = "Usuário não pode ser nulo";
    public static final String INICIO_UPDATE_USUARIO = "Iniciando atualização de usuário ID: {}";
    public static final String SUCESSO_UPDATE_USUARIO = "Usuário atualizado com sucesso ID: {}";
    public static final String INICIO_DELETE_USUARIO = "Iniciando exclusão de usuário ID: {}";
    public static final String SUCESSO_DELETE_USUARIO = "Usuário excluído com sucesso ID: {}";
    public static final String ERRO_INESPERADO_UPDATE_USUARIO = "Erro inesperado ao atualizar usuário com ID: {}";
    public static final String ERRO_INESPERADO_DELETE_USUARIO = "Erro inesperado ao excluir usuário com ID: {}";
    public static final String INICIO_CRIAR_USUARIO_BANCO_DADOS = "Iniciando criação de usuário no banco de dados";
    public static final String SUCESSO_CRIAR_USUARIO_BANCO_DADOS = "Usuário criado no banco de dados com sucesso";
    public static final String ERRO_CRIAR_USUARIO_BANCO_DADOS = "Erro ao criar usuário no banco de dados";

    public static final String EMAIL_OBRIGATORIO = "O e-mail é obrigatório e deve ser válido";
    public static final String SENHA_OBRIGATORIA = "A senha é obrigatória e deve ter no mínimo 6 caracteres";
    public static final String ROLE_NULA = "Role não pode ser nula.";
    public static final String ROLE_INVALIDA = "Valor de role inválido: %s. Valores permitidos: %s.";
    public static final String MENSAGEM_ACESSO_NEGADO = "Você não tem permissão para acessar este recurso.";

    // SecurityService
    public static final String INICIO_VERIFICACAO_ADMIN = "Verificando se usuário ID: {} é ADMIN.";
    public static final String RESULTADO_VERIFICACAO_ADMIN = "Usuário ID: {} é ADMIN? {}";
    public static final String INICIO_VERIFICACAO_OWNER = "Verificando se usuário ID: {} é proprietário do cliente ID: {}.";
    public static final String RESULTADO_VERIFICACAO_OWNER = "Usuário ID: {} é proprietário do cliente ID: {}? {}";
    public static final String INICIO_VALIDACAO_ACESSO = "Validando acesso do usuário ID: {} ao cliente ID: {}.";
    public static final String ACESSO_NEGADO_LOG = "Acesso negado para usuário ID: {} ao cliente ID: {}.";
    public static final String ACESSO_PERMITIDO_LOG = "Acesso permitido para usuário ID: {} ao cliente ID: {}.";

}
