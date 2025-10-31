package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
@RequestMapping("/")
public class VizitkaController {
    private final List<Vizitka> seznamVizitek = List.of(
            new Vizitka("Alžběta Vondráčková", "VaV", "Kozohlody 13", "28601 Vlkaneč", "av@test.cz", "601 123 456", "www.test1.cz"),
            new Vizitka("Elizabeth Vondráčková", "EaV", "Kobylí Hlava 3", "Golčův Jeníkov 58282", "Ev@test.cz", "602 123 456", "www.test2.cz"),
            new Vizitka("Jelizaveta Vondráčková", "JaV", "Kunemil 13", null, "jv@test.cz", "603 123 456", "www.test3.cz"),
            new Vizitka("Eliška Vondráčková", "SaV", "Sázavka 123", "Sázavka 58244", null, "604 123 456", "www.test4.cz"),
            new Vizitka("Radim Novák", null, "Habry 250", "Habry 58281", "rn@test.cz", "605 123 456", "www.test5.cz"),
            new Vizitka("Radek Novák", "Radek Novák s.r.o.", "Kněž 6", "Tis 58291", "rn2@test.cz", "606 123 456", "www.test6.cz"),
            new Vizitka("Radmila Nováková", "Radek Novák s.r.o.", "Kněž 6", "Tis 58291", "rn3@test.cz", "607 123 456", null),
            new Vizitka("Radana Novotná", "Hospodyňka z.ú.", "Kámen 8", "Kámen 58242", "rn4@test.cz", "608 123 456", "www.test8.cz"),
            new Vizitka("Růžena Jaroslava Nová", "Hospodyňka z.ú.", "Habry 167", "Habry 58281", "rjn@test.cz", "609 123 456", "www.test9.cz")
    );

    @GetMapping("/")//mapování do výsledných stránek - takze zde se seznam.ftlh ukaze na indexu
  //public String seznam(){return "seznam";}
    public ModelAndView seznam() {
        ModelAndView modelAndView = new ModelAndView("seznam");//viewName je název šablony ftlh -->seznam.ftlh
        modelAndView.addObject("seznamLidi", seznamVizitek);
        return modelAndView;
    }

   //@GetMapping("/0")
    //public String detail() {return "detail";}
    /*public ModelAndView detail() {
        ModelAndView modelAndView = new ModelAndView("/detail");
        modelAndView.addObject("vizitka", seznamVizitek.get(0));
        return modelAndView;
    }*/

    @GetMapping("/{id}")
    public ModelAndView detail(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("/detail");
        modelAndView.addObject("vizitka", seznamVizitek.get(id));
        return modelAndView;
    }


}
