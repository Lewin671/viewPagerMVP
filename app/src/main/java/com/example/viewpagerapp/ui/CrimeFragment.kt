package com.example.viewpagerapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.viewpagerapp.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "crimeInfo"


/**
 * A simple [Fragment] subclass.
 * Use the [CrimeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CrimeFragment : Fragment() {
    private var mCrimeInfo: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            mCrimeInfo = it.getString(ARG_PARAM1)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_crime, container, false)?.also {
            it.findViewById<TextView>(R.id.crimeInfo).text = mCrimeInfo
        }
    }

    companion object {
        @JvmStatic
        fun newInstance(crimeInfo: String) =
            CrimeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, crimeInfo)
                }
            }
    }
}