package com.example.bottomnavigationfragmentstate.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bottomnavigationfragmentstate.R
import com.example.bottomnavigationfragmentstate.adapter.SubjectAdapter
import com.example.bottomnavigationfragmentstate.databinding.FragmentHomeBinding
import com.example.bottomnavigationfragmentstate.model.Subject


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private var rvSubject: RecyclerView? = null
    private var subjectAdapter: SubjectAdapter? = null
    private var subjects: ArrayList<Subject>? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)
        Log.d("HomeFragment", "onCreateView: ")
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root


//        initComponents();
//issueNestedScrollview : https://stackoverflow.com/questions/48073469/recyclerview-inside-nestedscrollview-takes-too-much-time-when-loading-large-amou
        binding.rvSubject.isNestedScrollingEnabled = false
        binding.rvSubject.setHasFixedSize(false)

        subjects = homeViewModel.prepareData()

        subjectAdapter = SubjectAdapter(subjects!!, requireContext())
        val manager = LinearLayoutManager(requireContext())

        binding.rvSubject.layoutManager = manager
        binding.rvSubject.adapter = subjectAdapter




        return root
    }


    private fun initComponents() {
        rvSubject = view?.findViewById(R.id.rvSubject);
    }

    override fun onDestroyView() {
        Log.e("HomeFragment", "onDestroyView: ")
        super.onDestroyView()
        _binding = null
    }
}