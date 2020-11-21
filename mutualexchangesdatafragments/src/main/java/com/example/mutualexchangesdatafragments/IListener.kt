package com.example.mutualexchangesdatafragments

import androidx.fragment.app.Fragment
/** Ushbu interfaceni albatta Ishlatoayotgan activitiyingizda imlement qilib oling.*/
interface IListener {

  fun sendDataToFragment(fragment: Any): Fragment
  fun sendDataToFragment()

}