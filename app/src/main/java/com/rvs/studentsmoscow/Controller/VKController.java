package com.rvs.studentsmoscow.Controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import androidx.annotation.Nullable;

import com.google.firebase.database.annotations.NotNull;
import com.vk.api.sdk.VK;
import com.vk.api.sdk.auth.VKAccessToken;
import com.vk.api.sdk.auth.VKAuthCallback;
import com.vk.api.sdk.auth.VKScope;

import java.util.ArrayList;

public class VKController {

    private class IOThread extends Thread{

        /* Path that contains user token on his device; */
        private String DEFAULT_CONFIG_PATH;

        /* Variable That defines current thread work; */
        private int JOB_ID;

        /* Variable That contains current TOKEN; */
        private String TOKEN;

        /* @Constructor of IOThread;
         * @Param (String stat) open parameters for file;
         * @Param (String token) define user token if it necessary for current work.
         */
        IOThread(@NotNull String stat, @Nullable String token) {
            this.JOB_ID = stat.equalsIgnoreCase("r")? 1 : stat.equalsIgnoreCase("w")? 2 : 0;
            this.TOKEN = token;
        }

        @Override
        public void run(){
            switch (JOB_ID){
                case 1:
                    read(); break;
                case 2:
                    write();break;
            }
        }

        /* Thread job for read. */
        private void read(){
            //TODO read Realisation
            // TODO add request Permission Methods
        }

        /* Thread job for write. */
        private void write(){
            //TODO write realisation
        }

        /* Method that crypts TOKEN before saving it into a file;
         * @Return encrypted TOKEN.
         */
        private String encrypt(){
            //TODO encryption realisation using sha-256, MD5, etc...
            return null;
        }
        private void decrypt(){
            //TODO decryption realisation based on chosen encryption method.
        }
    }


    /* Collection that contains vk permissions */
    private ArrayList<VKScope> permissions = new ArrayList<>();
    /* Code blocks that adds chosen permissions */
    {
        permissions.add(VKScope.WALL);
    }

    public VKController(){}


    /* Method that check token local token
     * @Return boolean variable;
     */
    public boolean isAliveToken(){
        return false;
    }

    /* main method that calls when the app is started. */
    public void login(Activity activity, Context context){
        if(isAliveToken()){
            //TODO is local token alive?
        } else {
            VK.initialize(context);
            VK.login(activity,permissions);
        }
    }


    /* Method check result from VK Native activity
     * @Return boolean true if this result belongs to VK Native Activity
     */
    public boolean onActivityResult(int reqCode,int resCode,Intent intent){
        return VK.onActivityResult(reqCode, resCode, intent, new VKAuthCallback() {
            @Override
            public void onLogin(@NotNull VKAccessToken vkAccessToken) {
                new IOThread("w",vkAccessToken.getAccessToken()).start();
            }
            @Override
            public void onLoginFailed(int i) {
                //TODO Go to error activity;
            }
        });
    }

}
