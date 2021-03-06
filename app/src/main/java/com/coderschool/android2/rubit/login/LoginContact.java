/*
 * Copyright (c) 2016. Self Training Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by <tien.workinfo@gmail.com - rubit1359@gmail.com - manetivinay@gmail.com>, October 2016
 */

package com.coderschool.android2.rubit.login;

import com.coderschool.android2.rubit.base.BasePresenter;
import com.coderschool.android2.rubit.base.BaseView;

/**
 * Created by vinay on 03/11/16.
 */
public class LoginContact {

    interface View extends BaseView<LoginContact.Presenter> {

        void showViews();

//        void startAnotherActivity();
    }

    interface Presenter extends BasePresenter {
        void addViews();
    }
}
