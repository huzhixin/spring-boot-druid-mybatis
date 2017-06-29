package com.cto001.askservice.controller;

/**
 * Created by huzhixin on 2017/6/28.
 */
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.cto001.askservice.mapper.UserInfoMapper;
import com.cto001.askservice.model.UserInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
public class HomeController {
    private Logger logger = Logger.getLogger(HomeController.class);

    @Autowired
    private UserInfoMapper userInfoMapper;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model){

        UserInfo info = new UserInfo();
        info = userInfoMapper.selectByPrimaryKey(1);

        System.out.print(info.getLoginname());
        model.addAttribute("name","liangchong998");
        return "index";
    }
}
