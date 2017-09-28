package springBoot.hello;

import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final Logger logger = LoggerFactory.getLogger(GreetingController.class);
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting/info")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        logger.info("Saludo mandado");
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }

    @RequestMapping("/greeting/error")
    public Greeting greeting2(@RequestParam(value="name", defaultValue="World") String name) {
        logger.error("Error, mandando saludo genérico");
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping("/greeting/debug")
    public Greeting greeting3(@RequestParam(value="name", defaultValue="World") String name) {
        logger.debug("Saludo mandado? Sí");
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping("/greeting/trace")
    public Greeting greeting4(@RequestParam(value="name", defaultValue="World") String name) {

        logger.trace("Saludo enviado a " + name);
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping("/greeting/warn")
    public Greeting greeting5(@RequestParam(value="name", defaultValue="World") String name) {
        logger.warn("Cuidado, saludo generico enviado");
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping("/greeting/specific")
    public Greeting greeting6(@RequestParam(value="name", defaultValue="World") String name) throws NoSuchMethodException {
        Logger logger = LoggerFactory.getLogger(GreetingController.class.getMethod("greeting6", String.class).getName());
        logger.warn("Log especifico del metodo greeting6");
        this.logger.warn("Log de la clase " + this.getClass().getName());
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}