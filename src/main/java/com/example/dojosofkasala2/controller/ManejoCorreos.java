package com.example.dojosofkasala2.controller;

import com.example.dojosofkasala2.Dojosofkasala2Application;
import com.example.dojosofkasala2.model.Correo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

public class ManejoCorreos {

    private static final Logger log = LoggerFactory.getLogger(Dojosofkasala2Application.class);

    public List<Correo> correoList(){
        List<Correo> correos = new ArrayList<>();
        correos.add(new Correo("maeillanes@hotmail.com",false));
        correos.add(new Correo("osabarca@hotmail.com"));
        correos.add(new Correo("Sb.nashxo.sk8@hotmail.com", true));
        correos.add(new Correo("iabarcae@gmail.com"));
        correos.add(new Correo("carlosaguileram@hotmail.com"));
        correos.add(new Correo("ikis_rojo@hotmail.com"));
        correos.add(new Correo("daniela_aguilera_m500@hotmail.com", true));
        correos.add(new Correo("vizkala@gmail.com",true));
        correos.add(new Correo("alexus3@hotmail.com",true));
        correos.add(new Correo("capitanaguilera@outlook.com"));
        correos.add(new Correo("apalamosg@outlook.com"));
        correos.add(new Correo("niikhox__@hotmail.com"));
        correos.add(new Correo("luuuuuuci@hotmail.com"));
        correos.add(new Correo("bantomaui@gmail.com"));
        correos.add(new Correo("maeillanes@hotmail.com",true));
        correos.add(new Correo("maeillanes@hotmail.com"));
        correos.add(new Correo("eduardo.arancibia@outlook.com",true));
        correos.add(new Correo("kristian_siempre_azul@hotmail.com"));
        correos.add(new Correo("mapuchin@hotmail.com"));
        correos.add(new Correo("arahuetes@outlook.com"));
        correos.add(new Correo("martacam2002@outlook.com"));
        correos.add(new Correo("andrea.geoplanet@gmail.com",true));
        correos.add(new Correo("faraya1910@hotmail.com"));
        correos.add(new Correo("leonor.araya@gmail.com"));
        correos.add(new Correo("paulifran@hotmail.com"));
        correos.add(new Correo("bad.girl.-@hotmail.es",true));
        correos.add(new Correo("aargomedo@outlook.com",true));
        correos.add(new Correo("elizabetharmstrong39@gmail.com"));
        correos.add(new Correo("c_arnes@hotmail.com"));
        correos.add(new Correo("joy_pao_@hotmail.com"));
        correos.add(new Correo("arquitectoasenjo@gmail.com",true));
        return correos;
    }

    public void eliminarRepetidos(){
        Flux.fromIterable(correoList())
                .distinct()
                .subscribe(c -> log.info(c.toString()));
    }

    public void filtrarPorDominio(String dominio){
        Flux.fromIterable(correoList())
                .filter(c -> c.getCorreo().contains(dominio))
                .defaultIfEmpty(new Correo("No se encontraron coincidencias"))
                .subscribe(c -> log.info(c.toString()));
    }

    public void verificaionDeCaracteristicas(){
        Flux.fromIterable(correoList())
                .map(c -> {
                    c.getCorreo().contains("[/^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$/\n]");
                    return c;
                })
                .subscribe(c -> log.info(c.toString()));
    }

    public void contarCorreos(){
        Flux.fromIterable(correoList())
                .count()
                .subscribe(c -> log.info("Numero de correos : "+c));
    }

    public void contarCorreosPorDominio(String dominio){
        Flux.fromIterable(correoList())
                .filter(c -> c.getCorreo().contains(dominio))
                .count()
                .subscribe(c -> log.info("Numero de correos "+dominio+" : "+c));
    }

}
