/*
 *  Copyright (C) 2005-2015 Alfresco Software Limited.
 *
 *  This file is part of Alfresco Mobile for Android.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.alfresco.mobile.android.ui.site;

import java.util.List;

import org.alfresco.mobile.android.api.model.Site;
import org.alfresco.mobile.android.foundation.R;
import org.alfresco.mobile.android.ui.fragments.BaseListAdapter;
import org.alfresco.mobile.android.ui.utils.GenericViewHolder;

import android.support.v4.app.Fragment;
import android.view.View;

/**
 * Responsible to display the list of Site;
 * 
 * @author Jean Marie Pascal
 */
public class SitesPendingMembershipFoundationAdapter extends BaseListAdapter<Site, GenericViewHolder>
{
    public SitesPendingMembershipFoundationAdapter(Fragment fr, int textViewResourceId, List<Site> objects)
    {
        super(fr.getActivity(), textViewResourceId, objects);
    }

    @Override
    protected void updateTopText(GenericViewHolder vh, Site item)
    {
        vh.topText.setText(item.getShortName());
    }

    @Override
    protected void updateIcon(GenericViewHolder vh, Site item)
    {
        vh.icon.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_site_light));
    }

    @Override
    protected void updateBottomText(GenericViewHolder vh, Site item)
    {
        vh.bottomText.setVisibility(View.GONE);
    }
}
