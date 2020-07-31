package t3b.pv.retiros;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import t3b.pv.retiros.service.ModuloRetirosPv;

@SpringBootApplication
public class EnvioRetirosApplication implements ApplicationRunner {

	private static final Log log = LogFactory.getLog(EnvioRetirosApplication.class);
	
	@Autowired
	@Qualifier("retirosPv")
	private ModuloRetirosPv retirosPv;

	public static void main(String[] args) {
		SpringApplication.run(EnvioRetirosApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {

		log.info("****************************************");
		log.info("*   Desarrollo Hecho Para Tiendas 3B   *");
		log.info("*     JAR Impacta Retiros en BOT       *");
		log.info("****************************************");
		
		String[] arg = args.getSourceArgs();
		int idRegistro = Integer.parseInt(arg[0]);
		
		retirosPv.processRetiro(idRegistro);

	}

}