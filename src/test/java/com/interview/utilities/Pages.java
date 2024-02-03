package com.interview.utilities;

import com.interview.pages.BingSearchPage;

public class Pages {


        private static ThreadLocal<BingSearchPage> bingSearchPageThreadLocal = new ThreadLocal<>();

        public synchronized static  BingSearchPage getBigSearch(){
            if(bingSearchPageThreadLocal.get()==null){
                bingSearchPageThreadLocal.set(new BingSearchPage());
            }

            return bingSearchPageThreadLocal.get();
        }



}

