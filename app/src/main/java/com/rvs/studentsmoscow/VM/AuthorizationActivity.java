package com.rvs.studentsmoscow.VM;

import androidx.databinding.BaseObservable;

public class AuthorizationActivity extends BaseObservable {

    public AuthorizationActivity () {}

    /*
    * Метод, через который будет введён логин пользователя.
    * */
    public void enterTheLogin () {
    }

   
    public void enterThePass () {
    }

    /*
    * Метод, через который будет отправлен на сервер запрос на авторизацию. В случае успеха -
    * пользователь должен будет перейти на страницу со своим аккаунтом в "Студенты Москвы", а в
    * случае неудчачи должно вылезти сообщение об ошибке: интернет, перегружен сервер, несуществующий
    * пользователь и т.д. с обязательным обозначением ошибки.
    * */
    public void useButtonLogin () {
    }

    /*
    * Метод, через который будет реализована авторизация через ВК. Как это будет сделано - не ко мне,
    * я не представляю как это будет работать.
    * */
    public void useVKAuthorization () {
    }
}
