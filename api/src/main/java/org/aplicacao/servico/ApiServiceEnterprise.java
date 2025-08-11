package org.aplicacao.servico;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.aplicacao.dto.EnterpriseDTO;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiServiceEnterprise
{
    EnterpriseDTO enterpriseDTO = new EnterpriseDTO();
    public EnterpriseDTO getEnterprise(String cnpj) throws IOException, InterruptedException
    {
        try
        {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://receitaws.com.br/v1/cnpj/"+cnpj)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());


            ObjectMapper mapper = new ObjectMapper();
            enterpriseDTO = mapper.readValue(response.body(), EnterpriseDTO.class);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
            return enterpriseDTO;
    }
}
