package com.fluidsimulation.ui.fragments

import androidx.recyclerview.widget.*
import com.fluidsimulation.base.*
import com.fluidsimulation.databinding.*
import com.fluidsimulation.ext.*
import com.fluidsimulation.listeners.*
import com.fluidsimulation.model.*
import com.fluidsimulation.ui.activity.*
import com.fluidsimulation.ui.adapter.*
import com.magicfluids.*

class FragmentPresets : BaseFragment<FragmentPresetsBinding>(FragmentPresetsBinding::inflate) {

    private var presetAdapter: PresetsAdapter? = null

    override fun create() {}

    override fun FragmentPresetsBinding.viewCreated() {
        initAdapter()
        initData()
    }

    private fun FragmentPresetsBinding.initAdapter() {
        activity?.apply context@{
                recyclerView.apply {
                    applyDefault()
                    val gridLayoutManager = GridLayoutManager(this@context, 2, RecyclerView.VERTICAL, false)
                    layoutManager = gridLayoutManager
                    presetAdapter = PresetsAdapter(this@context, object : CommonListener {
                        override fun onOpen(any: Any?, position: Int) {
                            super.onOpen(any, position)
                            presetList?.get(position)?.setting?.let {
                                Settings().setFromInternalPreset(it)
                                (this@context as SettingsActivity).settings = it
                            }
                        }
                    })
                    adapter = presetAdapter
                }
        }
    }

    private fun initData() {
        val presets = mutableListOf<PresetData>()
        presets.add(PresetData("Gleeful Glimmers", "file:///android_asset/fluid_resources/fuild_sscren5.webp", Status.FREE))
        presets.add(PresetData("Flashy Fluids", "file:///android_asset/fluid_resources/fuild_sscren1.webp", Status.FREE))
        presets.add(PresetData("Blinding Bliss", "file:///android_asset/fluid_resources/fuild_sscren2.webp", Status.FREE))
        presets.add(PresetData("Life of Lights", "file:///android_asset/fluid_resources/fuild_sscren3.webp", Status.FREE))
        presets.add(PresetData("Cosmic Charm", "file:///android_asset/fluid_resources/fuild_sscren4.webp", Status.FREE))
        presets.add(PresetData("Strange Substance", "file:///android_asset/fluid_resources/fuild_sscren6.webp", Status.FREE))
        presets.add(PresetData("Jittery Jello", "file:///android_asset/fluid_resources/fuild_sscren7.webp", Status.FREE))
        presets.add(PresetData("Radioactive Rumble", "file:///android_asset/fluid_resources/fuild_sscren8.webp", Status.FREE))
        presets.add(PresetData("Wizard Wand", "file:///android_asset/fluid_resources/fuild_sscren9.webp", Status.FREE))
        presets.add(PresetData("Dancing in the Dark", "file:///android_asset/fluid_resources/fuild_sscren10.webp", Status.FREE))
        presets.add(PresetData("Blinking Beauty", "file:///android_asset/fluid_resources/fuild_sscren11.webp", Status.FREE))
        presets.add(PresetData("Earthly Elements", "file:///android_asset/fluid_resources/fuild_sscren12.webp", Status.FREE))
        presets.add(PresetData("Crazy Colors", "file:///android_asset/fluid_resources/fuild_sscren13.webp", Status.FREE))
        presets.add(PresetData("Random Remarkability", "file:///android_asset/fluid_resources/fuild_sscren14.webp", Status.FREE))
        presets.add(PresetData("Gravity Game", "file:///android_asset/fluid_resources/fuild_sscren15.webp", Status.FREE))
        presets.add(PresetData("Wonderful Whirls", "file:///android_asset/fluid_resources/fuild_sscren16.webp", Status.FREE))
        presets.add(PresetData("Fading Forms", "file:///android_asset/fluid_resources/fuild_sscren17.webp", Status.FREE))
        presets.add(PresetData("Wavy Winter", "file:///android_asset/fluid_resources/fuild_sscren18.webp", Status.FREE))
        presets.add(PresetData("Bloody Blue", "file:///android_asset/fluid_resources/fuild_sscren19.webp", Status.FREE))
        presets.add(PresetData("Lake of Lava", "file:///android_asset/fluid_resources/fuild_sscren20.webp", Status.FREE))
        presets.add(PresetData("Steady Sea", "file:///android_asset/fluid_resources/fuild_sscren21.webp", Status.FREE))
        presets.add(PresetData("Freaky Fun", "file:///android_asset/fluid_resources/fuild_sscren22.webp", Status.FREE))
        presets.add(PresetData("Incredible Ink", "file:///android_asset/fluid_resources/fuild_sscren23.webp", Status.FREE))
        presets.add(PresetData("Gentle Glow", "file:///android_asset/fluid_resources/fuild_sscren24.webp", Status.FREE))
        presets.add(PresetData("Transient Thoughts", "file:///android_asset/fluid_resources/fuild_sscren25.webp", Status.FREE))
        presets.add(PresetData("Glorious Galaxies", "file:///android_asset/fluid_resources/fuild_sscren26.webp", Status.FREE))
        presets.add(PresetData("Something Strange", "file:///android_asset/fluid_resources/fuild_sscren27.webp", Status.FREE))
        presets.add(PresetData("Cloudy Composition", "file:///android_asset/fluid_resources/fuild_sscren28.webp", Status.FREE))
        presets.add(PresetData("Glowing Glare", "file:///android_asset/fluid_resources/fuild_sscren29.webp", Status.FREE))
        presets.add(PresetData("Trippy Tint", "file:///android_asset/fluid_resources/fuild_sscren30.webp", Status.FREE))
        presets.add(PresetData("Girls Game", "file:///android_asset/fluid_resources/fuild_sscren31.webp", Status.FREE))
        presets.add(PresetData("Particle Party", "file:///android_asset/fluid_resources/fuild_sscren32.webp", Status.FREE))
        presets.add(PresetData("Busy Brilliance", "file:///android_asset/fluid_resources/fuild_sscren33.webp", Status.FREE))
        presets.add(PresetData("Grainy Greatness", "file:///android_asset/fluid_resources/fuild_sscren34.webp", Status.FREE))
        presets.add(PresetData("Magic Trail by Toni", "file:///android_asset/fluid_resources/fuild_sscren35.webp", Status.FREE))
        presets.add(PresetData("Lovely Liquid", "file:///android_asset/fluid_resources/fuild_sscren36.webp", Status.FREE))
        presets.add(PresetData("Floating Flames", "file:///android_asset/fluid_resources/fuild_sscren37.webp", Status.FREE))
        presets.add(PresetData("Glimming Glow", "file:///android_asset/fluid_resources/fuild_sscren38.webp", Status.FREE))
        presets.add(PresetData("Subtle Setting", "file:///android_asset/fluid_resources/fuild_sscren39.webp", Status.FREE))
        presets.add(PresetData("Calm Christmas", "file:///android_asset/fluid_resources/fuild_sscren40.webp", Status.FREE))
        presets.add(PresetData("Bouncing Beach", "file:///android_asset/fluid_resources/fuild_sscren41.webp", Status.FREE))
        presets.add(PresetData("Classy Combination", "file:///android_asset/fluid_resources/fuild_sscren42.webp", Status.FREE))
        presets.add(PresetData("Swirly Sparkles", "file:///android_asset/fluid_resources/fuild_sscren43.webp", Status.FREE))
        presets.add(PresetData("Transient Thoughts", "file:///android_asset/fluid_resources/fuild_sscren25.webp", Status.FREE))

        presetAdapter?.addAll(presets)
    }

    override fun FragmentPresetsBinding.initListeners() {}

    override fun FragmentPresetsBinding.initView() {}

    companion object {

        private const val TAG = "FragmentPresets"
        fun newInstance() = FragmentPresets()
    }
}