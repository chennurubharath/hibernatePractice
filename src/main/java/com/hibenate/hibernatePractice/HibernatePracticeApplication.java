package com.hibenate.hibernatePractice;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hibenate.hibernatePractice.entity.Course;
import com.hibenate.hibernatePractice.entity.Person;
import com.hibenate.hibernatePractice.repository.CourseRepository;
import com.hibenate.hibernatePractice.repository.JpaRepository;
import com.hibenate.hibernatePractice.repository.StudentRepository;

@SpringBootApplication
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
public class HibernatePracticeApplication  implements CommandLineRunner{

	
	private Logger logger =LoggerFactory.getLogger(this.getClass());
	
	
	@Autowired
	JpaRepository personJparepository;
	@Autowired
	StudentRepository studentRepository;
	@Autowired
	CourseRepository courseRepository;
	public static void main(String[] args) {
		SpringApplication.run(HibernatePracticeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		logger.info("User id 1001 ->{}"+personJparepository.update(new Person(100,"bharath", "Banglore", new Date())));
		
	Person p=	personJparepository.findById(100);
		logger.info("User id 100 ->{}"+p.getName());
		
		logger.info("User insert ->{}"+personJparepository.insert(new Person(103,"raja", "Banglore", new Date())));
		
		personJparepository.delete(1);
		
		
		logger.info("getAll --"+personJparepository.getAll());
		*/
		
	//	Course course=courseRepository.findByid(100L);
		
		//logger.info("person"+course);
		
		
		//courseRepository.deleteByid(110L);
		
		//courseRepository.save(new Course("micor services in 100 steps --updated"));
		
		
	//studentRepository.saveStudentwithPassport();
		
		courseRepository.addreviewforCourse();
		
		}
		
	}
I'm baby letterpress neutral milk hotel tarkovsky cray DSA meditation quinoa kogi YOLO cassette zizek solarpunk lacto-ferment new balance. JOMO four tet PBR&B noguchi mezcal xiao long bao jawn, robert walser duck fat lockwood mukbang farm-to-table microdosing mushrooms. Flannel lacto-ferment listicle, lockwood Brooklyn marfa scenester. Viral pour-over ego death unicorn lockwood gentrify. Cupping XOXO chicharrones lumbersexual mustache brunch banjo synth breadcrumbing noguchi selfies. Soft launch messenger bag offal, brutalism PBR&B mercury retrograde claire denis xiao long bao Brooklyn no wave mezcal molly baz mushroom coffee neutral milk hotel lomo. Y2k pickled retro mutual aid raclette four dollar toast.

Bauhaus harissa dembow direct trade, tufting crudo conservas pabst babitz solarpunk. Sartorial angela davis bode, ceramics jean shorts hairpin tofu somatic listicle hashtag deschooling black trumpet. Zines aesthetic single-origin coffee vape roof party ayahuasca, gorpcore gochujang visible mending the bear digicam didion microdosing mushrooms. Williamsburg jade roller bode sound bath raw denim. Stumptown next level tofu tinned fish jade roller try-hard braun band tee marxism four dollar toast iceland. Cloud bread furikake venmo brainrot tinyletter granny square, indigo dye mushroom coffee keffiyeh gorpcore ottessa moshfegh side hustle trust fund portland amaro.

Biodiesel tbh reading series margiela normcore intermittent fasting blog YOLO forage abolition four dollar toast spritz crochet. Buy nothing feeld imposter syndrome yuzu 8-bit. Fernet criterion deep v birth chart. Scenester mood board in this economy letterboxd wayfarers, semiotics capitalist realism angela davis feeld cred. Post-ironic omakase succulents shaman garum lorde muji keffiyeh burrata pug iPhone bandcamp rams microdosing mushrooms issey miyake.

Poke gravel bike trust fund bolaño kombucha messenger bag kitsch letterpress danish modern la jetée ari aster same the bear robert walser fingerstache. Pabst nootropic ayahuasca the stew DIY semiotics leggings margiela raclette salvia. DSA nakashima chillwave herman miller tonx forage kickstarter, readymade muji eames enneagram lockwood duck fat sus master cleanse. Ketamine therapy cornhole are.na four dollar toast garum signet. Bushwick natural wine shakshuka twee comme des garçons solarpunk A24 breathwork humblebrag ketamine therapy bell hooks artisan.

