package com.reactcommunity.rndatetimepicker;

import android.app.TimePickerDialog;

public final class RNConstants {
  public static final String ERROR_NO_ACTIVITY = "E_NO_ACTIVITY";
  public static final String ARG_VALUE = "value";
  public static final String ARG_MINDATE = "minimumDate";
  public static final String ARG_MAXDATE = "maximumDate";
  public static final String ARG_INTERVAL = "minuteInterval";
  public static final String ARG_IS24HOUR = "is24Hour";
  public static final String ARG_DISPLAY = "display";
  public static final String ARG_DIALOG_BUTTONS = "dialogButtons";
  public static final String ARG_TZOFFSET_MINS = "timeZoneOffsetInMinutes";
  public static final String ARG_TZ_NAME = "timeZoneName";
  public static final String ARG_TESTID = "testID";
  public static final String ARG_TITLE = "title";
  public static final String ARG_INITIAL_INPUT_MODE = "initialInputMode";
  public static final String ARG_FULLSCREEN = "fullscreen";
  public static final String ACTION_DATE_SET = "dateSetAction";
  public static final String ACTION_TIME_SET = "timeSetAction";
  public static final String ACTION_DISMISSED = "dismissedAction";
  public static final String ACTION_NEUTRAL_BUTTON = "neutralButtonAction";
  public static final String FIRST_DAY_OF_WEEK = "firstDayOfWeek";

  /**
   * Minimum date supported by {@link TimePickerDialog}, 01 Jan 1900
   */
  public static final long DEFAULT_MIN_DATE = -2208988800001l;

  /**
    * Minimum and default time picker minute interval
    */
  public static final int DEFAULT_TIME_PICKER_INTERVAL = 1;
}
