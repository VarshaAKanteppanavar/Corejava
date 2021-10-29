package com.xworkz.dp;


import com.xworkz.dp.dao.*;
import com.xworkz.dp.dto.*;

public class WebSeriesRunner {

			public static void main(String[] args) {
				
				WebSeriesDTO webSeriesDTOs=new  WebSeriesDTO("asur","xyz",100,4.5f,1);
				WebSeriesDTO webSeriesDTOs1=new  WebSeriesDTO("money heist","xyz",2000,4.8f,5);
				WebSeriesDTO webSeriesDTOs2=new WebSeriesDTO("worst witch","xyz",2500,4.1f,2);
				
				
				WebSeriesDAO web=new WebSeriesDAO();
				web.save(webSeriesDTOs);
				web.save(webSeriesDTOs1);
				
				
				web.display();
				
				web.delete(-1);
				web.delete(0);
				
				web.display();
				
				
				web.update(webSeriesDTOs2,6);
				
				web.display();
				
				
			}

		

}


