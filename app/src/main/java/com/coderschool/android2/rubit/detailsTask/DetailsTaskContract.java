package com.coderschool.android2.rubit.detailsTask;

import com.coderschool.android2.rubit.base.BasePresenter;
import com.coderschool.android2.rubit.base.BaseView;

/**
 * Created by vinay on 22/11/16.
 */

public class DetailsTaskContract {

    interface View extends BaseView<Presenter> {

        void showGoogleMap();

        void currentLocationOnClick();

        void showAddressDetails();

        void showFirstTextView();

        void showSecondTextView();

        void showThirdTextView();

        void showPictureImageView();

        void editFirstTextOnKeyListener();

        void editSecondTextOnKeyListener();

        void editThirdTextOnKeyListener();

        void plusButtonOnClick();

        void showPlusButton();

    }

    interface Presenter extends BasePresenter {

        void selectCurrentLocationOnMap();

        void updateFirstTextView();

        void updateSecondTextView();

        void updateThirdTextView();

        void selectPicturePlusButton();
    }
}
