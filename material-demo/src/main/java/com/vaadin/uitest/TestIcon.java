/*
 * Copyright 2000-2016 Vaadin Ltd.
 *
 * Modifications Copyright 2017 appreciated
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.uitest;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.server.Resource;
import com.vaadin.server.ThemeResource;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vaadin Ltd
 */
public class TestIcon {

    int iconCount = 0;

    public TestIcon(int startIndex) {
        iconCount = startIndex;
    }

    public Resource get() {
        return get(false, 32);
    }

    public Resource get(boolean isImage) {
        return get(isImage, 32);
    }

    public Resource get(boolean isImage, int imageSize) {
        if (!isImage) {
            if (++iconCount >= ICONS.size()) {
                iconCount = 0;
            }
            return ICONS.get(iconCount);
        }
        return new ThemeResource(
                "../../icons/" + imageSize + "/document.png");
    }

    static List<VaadinIcons> ICONS = new ArrayList<>();

    static {
        ICONS.add(VaadinIcons.ADJUST);
        ICONS.add(VaadinIcons.ALIGN_CENTER);
        ICONS.add(VaadinIcons.ALIGN_JUSTIFY);
        ICONS.add(VaadinIcons.ALIGN_LEFT);
        ICONS.add(VaadinIcons.ALIGN_RIGHT);
        ICONS.add(VaadinIcons.AMBULANCE);
        ICONS.add(VaadinIcons.ANCHOR);
        ICONS.add(VaadinIcons.ANGLE_DOUBLE_DOWN);
        ICONS.add(VaadinIcons.ANGLE_DOUBLE_LEFT);
        ICONS.add(VaadinIcons.ANGLE_DOUBLE_RIGHT);
        ICONS.add(VaadinIcons.ANGLE_DOUBLE_UP);
        ICONS.add(VaadinIcons.ANGLE_DOWN);
        ICONS.add(VaadinIcons.ANGLE_LEFT);
        ICONS.add(VaadinIcons.ANGLE_RIGHT);
        ICONS.add(VaadinIcons.ANGLE_UP);
        ICONS.add(VaadinIcons.ARCHIVE);
        ICONS.add(VaadinIcons.ARROW_CIRCLE_DOWN);
        ICONS.add(VaadinIcons.ARROW_CIRCLE_LEFT);
        ICONS.add(VaadinIcons.ARROW_CIRCLE_RIGHT);
        ICONS.add(VaadinIcons.ARROW_CIRCLE_UP);
        ICONS.add(VaadinIcons.ARROW_DOWN);
        ICONS.add(VaadinIcons.ARROW_LEFT);
        ICONS.add(VaadinIcons.ARROW_RIGHT);
        ICONS.add(VaadinIcons.ARROW_UP);
        ICONS.add(VaadinIcons.ARROWS);
        ICONS.add(VaadinIcons.ASTERISK);
        ICONS.add(VaadinIcons.BAN);
        ICONS.add(VaadinIcons.BARCODE);
        ICONS.add(VaadinIcons.BELL);
        ICONS.add(VaadinIcons.BELL_O);
        ICONS.add(VaadinIcons.BOLD);
        ICONS.add(VaadinIcons.BOLT);
        ICONS.add(VaadinIcons.BOMB);
        ICONS.add(VaadinIcons.BOOK);
        ICONS.add(VaadinIcons.BOOKMARK);
        ICONS.add(VaadinIcons.BOOKMARK_O);
        ICONS.add(VaadinIcons.BRIEFCASE);
        ICONS.add(VaadinIcons.BUG);
        ICONS.add(VaadinIcons.BUILDING);
        ICONS.add(VaadinIcons.BUILDING_O);
        ICONS.add(VaadinIcons.BULLSEYE);
        ICONS.add(VaadinIcons.CALENDAR);
        ICONS.add(VaadinIcons.CALENDAR_O);
        ICONS.add(VaadinIcons.CAMERA);
        ICONS.add(VaadinIcons.CAR);
        ICONS.add(VaadinIcons.CARET_DOWN);
        ICONS.add(VaadinIcons.CARET_LEFT);
        ICONS.add(VaadinIcons.CARET_RIGHT);
        ICONS.add(VaadinIcons.CARET_UP);
        ICONS.add(VaadinIcons.CHECK);
        ICONS.add(VaadinIcons.CHECK_CIRCLE);
        ICONS.add(VaadinIcons.CHECK_CIRCLE_O);
        ICONS.add(VaadinIcons.CHECK_SQUARE);
        ICONS.add(VaadinIcons.CHECK_SQUARE_O);
        ICONS.add(VaadinIcons.CHEVRON_CIRCLE_DOWN);
        ICONS.add(VaadinIcons.CHEVRON_CIRCLE_LEFT);
        ICONS.add(VaadinIcons.CHEVRON_CIRCLE_RIGHT);
        ICONS.add(VaadinIcons.CHEVRON_CIRCLE_UP);
        ICONS.add(VaadinIcons.CHEVRON_DOWN);
        ICONS.add(VaadinIcons.CHEVRON_LEFT);
        ICONS.add(VaadinIcons.CHEVRON_RIGHT);
        ICONS.add(VaadinIcons.CHEVRON_UP);
        ICONS.add(VaadinIcons.CHILD);
        ICONS.add(VaadinIcons.CIRCLE);
        ICONS.add(VaadinIcons.CIRCLE_THIN);
        ICONS.add(VaadinIcons.CLIPBOARD);
        ICONS.add(VaadinIcons.CLOUD);
        ICONS.add(VaadinIcons.CLOUD_DOWNLOAD);
        ICONS.add(VaadinIcons.CLOUD_UPLOAD);
        ICONS.add(VaadinIcons.CODE);
        ICONS.add(VaadinIcons.COFFEE);
        ICONS.add(VaadinIcons.COG);
        ICONS.add(VaadinIcons.COGS);
        ICONS.add(VaadinIcons.COMMENT);
        ICONS.add(VaadinIcons.COMMENT_O);
        ICONS.add(VaadinIcons.COMMENTS);
        ICONS.add(VaadinIcons.COMMENTS_O);
        ICONS.add(VaadinIcons.COMPRESS);
        ICONS.add(VaadinIcons.COPY);
        ICONS.add(VaadinIcons.CREDIT_CARD);
        ICONS.add(VaadinIcons.CROP);
        ICONS.add(VaadinIcons.CROSSHAIRS);
        ICONS.add(VaadinIcons.CUBE);
        ICONS.add(VaadinIcons.CUBES);
        ICONS.add(VaadinIcons.CUTLERY);
        ICONS.add(VaadinIcons.DASHBOARD);
        ICONS.add(VaadinIcons.DATABASE);
        ICONS.add(VaadinIcons.DESKTOP);
        ICONS.add(VaadinIcons.DOLLAR);
        ICONS.add(VaadinIcons.DOWNLOAD);
        ICONS.add(VaadinIcons.EDIT);
        ICONS.add(VaadinIcons.EJECT);
        ICONS.add(VaadinIcons.ELLIPSIS_H);
        ICONS.add(VaadinIcons.ELLIPSIS_V);
        ICONS.add(VaadinIcons.ENVELOPE);
        ICONS.add(VaadinIcons.ENVELOPE_O);
        ICONS.add(VaadinIcons.ERASER);
        ICONS.add(VaadinIcons.EURO);
        ICONS.add(VaadinIcons.EXCHANGE);
        ICONS.add(VaadinIcons.EXCLAMATION);
        ICONS.add(VaadinIcons.EXCLAMATION_CIRCLE);
        ICONS.add(VaadinIcons.EXPAND);
        ICONS.add(VaadinIcons.EXTERNAL_LINK);
        ICONS.add(VaadinIcons.EYE);
        ICONS.add(VaadinIcons.EYE_SLASH);
        ICONS.add(VaadinIcons.FACEBOOK);
        ICONS.add(VaadinIcons.FACEBOOK_SQUARE);
        ICONS.add(VaadinIcons.FAST_BACKWARD);
        ICONS.add(VaadinIcons.FAST_FORWARD);
        ICONS.add(VaadinIcons.FEMALE);
        ICONS.add(VaadinIcons.FILE);
        ICONS.add(VaadinIcons.FILE_O);
        ICONS.add(VaadinIcons.FILE_TEXT);
        ICONS.add(VaadinIcons.FILE_TEXT_O);
        ICONS.add(VaadinIcons.FILM);
        ICONS.add(VaadinIcons.FILTER);
        ICONS.add(VaadinIcons.FIRE);
        ICONS.add(VaadinIcons.FLAG);
        ICONS.add(VaadinIcons.FLAG_CHECKERED);
        ICONS.add(VaadinIcons.FLAG_O);
        ICONS.add(VaadinIcons.FLASH);
        ICONS.add(VaadinIcons.FLASK);
        ICONS.add(VaadinIcons.FOLDER);
        ICONS.add(VaadinIcons.FOLDER_O);
        ICONS.add(VaadinIcons.FOLDER_OPEN);
        ICONS.add(VaadinIcons.FOLDER_OPEN_O);
        ICONS.add(VaadinIcons.FONT);
        ICONS.add(VaadinIcons.FORWARD);
        ICONS.add(VaadinIcons.FROWN_O);
        ICONS.add(VaadinIcons.GAMEPAD);
        ICONS.add(VaadinIcons.GAVEL);
        ICONS.add(VaadinIcons.GIFT);
        ICONS.add(VaadinIcons.GLASS);
        ICONS.add(VaadinIcons.GLOBE);
        ICONS.add(VaadinIcons.GOOGLE_PLUS);
        ICONS.add(VaadinIcons.GOOGLE_PLUS_SQUARE);
        ICONS.add(VaadinIcons.GROUP);
        ICONS.add(VaadinIcons.HEADER);
        ICONS.add(VaadinIcons.HEADPHONES);
        ICONS.add(VaadinIcons.HEART);
        ICONS.add(VaadinIcons.HEART_O);
        ICONS.add(VaadinIcons.HOME);
        ICONS.add(VaadinIcons.INBOX);
        ICONS.add(VaadinIcons.INDENT);
        ICONS.add(VaadinIcons.INFO);
        ICONS.add(VaadinIcons.INFO_CIRCLE);
        ICONS.add(VaadinIcons.INSTITUTION);
        ICONS.add(VaadinIcons.ITALIC);
        ICONS.add(VaadinIcons.KEY);
        ICONS.add(VaadinIcons.KEYBOARD_O);
        ICONS.add(VaadinIcons.LAPTOP);
        ICONS.add(VaadinIcons.LEVEL_DOWN);
        ICONS.add(VaadinIcons.LEVEL_UP);
        ICONS.add(VaadinIcons.LINK);
        ICONS.add(VaadinIcons.LIST);
        ICONS.add(VaadinIcons.LIST_OL);
        ICONS.add(VaadinIcons.LIST_UL);
        ICONS.add(VaadinIcons.LOCATION_ARROW);
        ICONS.add(VaadinIcons.LOCK);
        ICONS.add(VaadinIcons.MAGIC);
        ICONS.add(VaadinIcons.MAGNET);
        ICONS.add(VaadinIcons.MALE);
        ICONS.add(VaadinIcons.MAP_MARKER);
        ICONS.add(VaadinIcons.MEH_O);
        ICONS.add(VaadinIcons.MICROPHONE);
        ICONS.add(VaadinIcons.MINUS);
        ICONS.add(VaadinIcons.MINUS_CIRCLE);
        ICONS.add(VaadinIcons.MOBILE);
        ICONS.add(VaadinIcons.MONEY);
        ICONS.add(VaadinIcons.MOON_O);
        ICONS.add(VaadinIcons.MUSIC);
        ICONS.add(VaadinIcons.PAPERCLIP);
        ICONS.add(VaadinIcons.PARAGRAPH);
        ICONS.add(VaadinIcons.PASTE);
        ICONS.add(VaadinIcons.PAUSE);
        ICONS.add(VaadinIcons.PENCIL);
        ICONS.add(VaadinIcons.PHONE);
        ICONS.add(VaadinIcons.PLAY);
        ICONS.add(VaadinIcons.PLAY_CIRCLE);
        ICONS.add(VaadinIcons.PLAY_CIRCLE_O);
        ICONS.add(VaadinIcons.PLUS);
        ICONS.add(VaadinIcons.PLUS_CIRCLE);
        ICONS.add(VaadinIcons.POWER_OFF);
        ICONS.add(VaadinIcons.PRINT);
        ICONS.add(VaadinIcons.PUZZLE_PIECE);
        ICONS.add(VaadinIcons.QRCODE);
        ICONS.add(VaadinIcons.QUESTION);
        ICONS.add(VaadinIcons.QUESTION_CIRCLE);
        ICONS.add(VaadinIcons.QUOTE_LEFT);
        ICONS.add(VaadinIcons.QUOTE_RIGHT);
        ICONS.add(VaadinIcons.RANDOM);
        ICONS.add(VaadinIcons.RECYCLE);
        ICONS.add(VaadinIcons.REFRESH);
        ICONS.add(VaadinIcons.REPLY);
        ICONS.add(VaadinIcons.REPLY_ALL);
        ICONS.add(VaadinIcons.RETWEET);
        ICONS.add(VaadinIcons.ROAD);
        ICONS.add(VaadinIcons.ROCKET);
        ICONS.add(VaadinIcons.ROTATE_LEFT);
        ICONS.add(VaadinIcons.ROTATE_RIGHT);
        ICONS.add(VaadinIcons.RSS);
        ICONS.add(VaadinIcons.RSS_SQUARE);
        ICONS.add(VaadinIcons.SCISSORS);
        ICONS.add(VaadinIcons.SEARCH);
        ICONS.add(VaadinIcons.SEARCH_MINUS);
        ICONS.add(VaadinIcons.SEARCH_PLUS);
        ICONS.add(VaadinIcons.SHARE);
        ICONS.add(VaadinIcons.SHARE_SQUARE);
        ICONS.add(VaadinIcons.SHIELD);
        ICONS.add(VaadinIcons.SIGN_IN);
        ICONS.add(VaadinIcons.SIGN_OUT);
        ICONS.add(VaadinIcons.SIGNAL);
        ICONS.add(VaadinIcons.SITEMAP);
        ICONS.add(VaadinIcons.SLIDERS);
        ICONS.add(VaadinIcons.SORT);
        ICONS.add(VaadinIcons.SPINNER);
        ICONS.add(VaadinIcons.SPOON);
        ICONS.add(VaadinIcons.STAR);
        ICONS.add(VaadinIcons.STAR_O);
        ICONS.add(VaadinIcons.STEP_BACKWARD);
        ICONS.add(VaadinIcons.STEP_FORWARD);
        ICONS.add(VaadinIcons.STETHOSCOPE);
        ICONS.add(VaadinIcons.STOP);
        ICONS.add(VaadinIcons.STRIKETHROUGH);
        ICONS.add(VaadinIcons.SUBSCRIPT);
        ICONS.add(VaadinIcons.SUITCASE);
        ICONS.add(VaadinIcons.SUN_O);
        ICONS.add(VaadinIcons.SUPERSCRIPT);
        ICONS.add(VaadinIcons.TABLE);
        ICONS.add(VaadinIcons.TABLET);
        ICONS.add(VaadinIcons.TAG);
        ICONS.add(VaadinIcons.TAGS);
        ICONS.add(VaadinIcons.TASKS);
        ICONS.add(VaadinIcons.TAXI);
        ICONS.add(VaadinIcons.TERMINAL);
        ICONS.add(VaadinIcons.TEXT_HEIGHT);
        ICONS.add(VaadinIcons.TEXT_WIDTH);
        ICONS.add(VaadinIcons.THUMBS_DOWN);
        ICONS.add(VaadinIcons.THUMBS_UP);
        ICONS.add(VaadinIcons.TICKET);
        ICONS.add(VaadinIcons.TROPHY);
        ICONS.add(VaadinIcons.TRUCK);
        ICONS.add(VaadinIcons.TWITTER);
        ICONS.add(VaadinIcons.TWITTER_SQUARE);
        ICONS.add(VaadinIcons.UMBRELLA);
        ICONS.add(VaadinIcons.UNDERLINE);
        ICONS.add(VaadinIcons.UNLINK);
        ICONS.add(VaadinIcons.UNLOCK);
        ICONS.add(VaadinIcons.UPLOAD);
        ICONS.add(VaadinIcons.USER);
        ICONS.add(VaadinIcons.USERS);
        ICONS.add(VaadinIcons.VIMEO_SQUARE);
        ICONS.add(VaadinIcons.VOLUME_DOWN);
        ICONS.add(VaadinIcons.VOLUME_OFF);
        ICONS.add(VaadinIcons.VOLUME_UP);
        ICONS.add(VaadinIcons.WARNING);
        ICONS.add(VaadinIcons.WRENCH);
        ICONS.add(VaadinIcons.YOUTUBE);
        ICONS.add(VaadinIcons.YOUTUBE_SQUARE);
    }
}
