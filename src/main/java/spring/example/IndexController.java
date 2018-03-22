/** \file
 * 
 * Mar 21, 2018
 *
 * Copyright Ian Kaplan 2018
 *
 * @author Ian Kaplan, www.bearcave.com, iank@bearcave.com
 */
package spring.example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    
    /**
     * Controller function for the index HTML page.
     */
    @RequestMapping("/")
    public String index(Map<String, Object> model) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM d yyyy : HH:mm:ss:SSS z");
        Date now = new Date();
        String dateStr = dateFormat.format( now );
        model.put("time", dateStr);
        return "index";
    }

}
