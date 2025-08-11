package org.aplicacao.dto;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EnterpriseDTO
{
    private String abertura;
    private String situacao;
    private String tipo;
    private String nome;
    private String fantasia;
    private String porte;
    private String natureza_juridica;
    private List<Qsa> qsa;
    private String logradouro;
    private String numero;
    private String complemento;
    private String municipio;
    private String bairro;
    private String uf;
    private String cep;
    private String email;
    private String telefone;
    private String data_situacao;
    private String motivo_situacao;
    private String cnpj;
    private String ultima_atualizacao;

    @Override
    public String toString()
    {
        return "\n--- Dados da Empresa ---\n" +
                "CNPJ: " + cnpj + "\n" +
                "Nome: " + nome + "\n" +
                "Fantasia: " + fantasia + "\n" +
                "Situação: " + situacao + " (" + motivo_situacao + ")\n" +
                "Data da Situação: " + data_situacao + "\n" +
                "Tipo: " + tipo + "\n" +
                "Porte: " + porte + "\n" +
                "Natureza Jurídica: " + natureza_juridica + "\n" +
                "Abertura: " + abertura + "\n" +
                "Última Atualização: " + ultima_atualizacao + "\n" +
                "Capital Social: " + capital_social + "\n" +
                "E-mail: " + email + "\n" +
                "Telefone: " + telefone + "\n" +
                "Endereço: " + logradouro + ", " + numero + (complemento != null && !complemento.isEmpty() ? " - " + complemento : "") + "\n" +
                "Bairro: " + bairro + "\n" +
                "Município: " + municipio + "/" + uf + "\n" +
                "CEP: " + cep + "\n" +
                "Atividade Principal: " + atividade_principal + "\n" +
                "Atividades Secundárias: " + atividades_secundarias + "\n" +
                "QSA: " + qsa + "\n" +
                "Simples: " + (simples != null ? simples.isOptante() : "N/A") + "\n" +
                "Simei: " + (simei != null ? simei.isOptante() : "N/A") + "\n" +
                "Billing: " + (billing != null ? "Free=" + billing.isFree() + ", Database=" + billing.isDatabase() : "N/A") + "\n" +
                "-------------------------";
    }

    private String status;
    private String efr;
    private String situacao_especial;
    private String data_situacao_especial;
    private List<Atividade> atividade_principal;
    private List<Atividade> atividades_secundarias;
    private String capital_social;
    private Simples simples;
    private Simei simei;
    private Extra extra;
    private Billing billing;

    // Getters e Setters

    public String getAbertura() {
        return abertura;
    }

    public void setAbertura(String abertura) {
        this.abertura = abertura;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getNatureza_juridica() {
        return natureza_juridica;
    }

    public void setNatureza_juridica(String natureza_juridica) {
        this.natureza_juridica = natureza_juridica;
    }

    public List<Qsa> getQsa() {
        return qsa;
    }

    public void setQsa(List<Qsa> qsa) {
        this.qsa = qsa;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getData_situacao() {
        return data_situacao;
    }

    public void setData_situacao(String data_situacao) {
        this.data_situacao = data_situacao;
    }

    public String getMotivo_situacao() {
        return motivo_situacao;
    }

    public void setMotivo_situacao(String motivo_situacao) {
        this.motivo_situacao = motivo_situacao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getUltima_atualizacao() {
        return ultima_atualizacao;
    }

    public void setUltima_atualizacao(String ultima_atualizacao) {
        this.ultima_atualizacao = ultima_atualizacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEfr() {
        return efr;
    }

    public void setEfr(String efr) {
        this.efr = efr;
    }

    public String getSituacao_especial() {
        return situacao_especial;
    }

    public void setSituacao_especial(String situacao_especial) {
        this.situacao_especial = situacao_especial;
    }

    public String getData_situacao_especial() {
        return data_situacao_especial;
    }

    public void setData_situacao_especial(String data_situacao_especial) {
        this.data_situacao_especial = data_situacao_especial;
    }

    public List<Atividade> getAtividade_principal() {
        return atividade_principal;
    }

    public void setAtividade_principal(List<Atividade> atividade_principal) {
        this.atividade_principal = atividade_principal;
    }

    public List<Atividade> getAtividades_secundarias() {
        return atividades_secundarias;
    }

    public void setAtividades_secundarias(List<Atividade> atividades_secundarias) {
        this.atividades_secundarias = atividades_secundarias;
    }

    public String getCapital_social() {
        return capital_social;
    }

    public void setCapital_social(String capital_social) {
        this.capital_social = capital_social;
    }

    public Simples getSimples() {
        return simples;
    }

    public void setSimples(Simples simples) {
        this.simples = simples;
    }

    public Simei getSimei() {
        return simei;
    }

    public void setSimei(Simei simei) {
        this.simei = simei;
    }

    public Extra getExtra() {
        return extra;
    }

    public void setExtra(Extra extra) {
        this.extra = extra;
    }

    public Billing getBilling() {
        return billing;
    }

    public void setBilling(Billing billing) {
        this.billing = billing;
    }

    // Classes aninhadas

    public static class Qsa {
        private String nome;
        private String qual;

        // Getters e Setters
        public String getNome() { return nome; }
        public void setNome(String nome) { this.nome = nome; }
        public String getQual() { return qual; }
        public void setQual(String qual) { this.qual = qual; }
    }

    public static class Atividade {
        private String code;
        private String text;

        // Getters e Setters
        public String getCode() { return code; }
        public void setCode(String code) { this.code = code; }
        public String getText() { return text; }
        public void setText(String text) { this.text = text; }
    }

    public static class Simples {
        private boolean optante;
        private String data_opcao;
        private String data_exclusao;
        private String ultima_atualizacao;

        // Getters e Setters
        public boolean isOptante() { return optante; }
        public void setOptante(boolean optante) { this.optante = optante; }
        public String getData_opcao() { return data_opcao; }
        public void setData_opcao(String data_opcao) { this.data_opcao = data_opcao; }
        public String getData_exclusao() { return data_exclusao; }
        public void setData_exclusao(String data_exclusao) { this.data_exclusao = data_exclusao; }
        public String getUltima_atualizacao() { return ultima_atualizacao; }
        public void setUltima_atualizacao(String ultima_atualizacao) { this.ultima_atualizacao = ultima_atualizacao; }
    }

    public static class Simei {
        private boolean optante;
        private String data_opcao;
        private String data_exclusao;
        private String ultima_atualizacao;

        // Getters e Setters
        public boolean isOptante() { return optante; }
        public void setOptante(boolean optante) { this.optante = optante; }
        public String getData_opcao() { return data_opcao; }
        public void setData_opcao(String data_opcao) { this.data_opcao = data_opcao; }
        public String getData_exclusao() { return data_exclusao; }
        public void setData_exclusao(String data_exclusao) { this.data_exclusao = data_exclusao; }
        public String getUltima_atualizacao() { return ultima_atualizacao; }
        public void setUltima_atualizacao(String ultima_atualizacao) { this.ultima_atualizacao = ultima_atualizacao; }
    }

    public static class Extra {
        // Vazio conforme o JSON
    }

    public static class Billing {
        private boolean free;
        private boolean database;

        // Getters e Setters
        public boolean isFree() { return free; }
        public void setFree(boolean free) { this.free = free; }
        public boolean isDatabase() { return database; }
        public void setDatabase(boolean database) { this.database = database; }
    }
}
