package br.com.fatecararas.f290_dsm_tp2_piadasnerd;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.fatecararas.f290_dsm_tp2_piadasnerd.model.Piada;
import br.com.fatecararas.f290_dsm_tp2_piadasnerd.repositories.PiadaRepository;

@SpringBootApplication
public class PiadasnerdApplication implements CommandLineRunner {

	@Autowired
	private PiadaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(PiadasnerdApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		List<Piada> novasPiadas = Arrays.asList(new Piada("O que o C++ disse para o C?", "Você não tem classe!", true),
                new Piada("O que o C:/DarthVader disse para C:/DarthVader/Luke?", "Luke, I am your folder!", true),
                new Piada("Sarah Connor e T-1000 viajam no tempo para evitar o Apocalipse. - Agora que chegamos á base da Skynet, como sabotamos o mainframe?", "- Instala Vista, baby", true));

		repository.saveAll(novasPiadas);

		List<Piada> piadas = repository.findAll();

		System.out.println(piadas);

	}

}
