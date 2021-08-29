package knapsack

object TestHelper {

    /**
     * Test Pattern 1
     */
    val weights1 = listOf(3, 4, 1, 2, 3)
    val values1 = listOf(2, 3, 2, 3, 6)
    const val weightMax1 = 10

    /**
     * Test Pattern 2
     */
    val weights2 = listOf(11, 4, 2, 1, 3, 5)
    val values2 = listOf(15, 4, 3, 2, 1, 8)
    const val weightMax2 = 15

    /**
     * Test Pattern 3
     */
    val weights3 = listOf(2, 1, 3, 2, 1, 5)
    val values3 = listOf(3, 2, 6, 1, 3, 85)
    const val weightMax3 = 9

    /**
     * Test Pattern 4
     */
    val weights4 = listOf(2, 2, 1, 3)
    val values4 = listOf(4, 5, 2, 8)
    const val weightMax4 = 5

    /**
     * Test Pattern 5
     */
    val weights5 = listOf(881, 721, 721, 892, 934, 882, 721, 889, 808, 829, 728, 915, 765, 826, 836, 894, 890, 778, 740, 803, 832, 928, 894, 835, 725, 821, 840, 783, 789, 800, 911, 762, 751, 816, 828, 877, 957, 727, 946, 741, 767, 856, 782, 809, 778, 890, 909, 798, 888, 784, 845, 878, 799, 836, 730, 809, 860, 938, 733, 921, 729, 895, 958, 746, 797, 727, 899, 936, 816, 894, 749, 755, 720, 831, 854, 804, 909, 768, 869, 850, 835, 811, 818, 799, 760, 819, 727, 843, 770, 811, 859, 725, 787, 724, 852, 829, 842, 801, 854, 741)
    val values5 = listOf(783, 813, 808, 739, 790, 873, 736, 871, 809, 903, 848, 832, 749, 708, 778, 884, 769, 698, 803, 931, 797, 856, 764, 684, 868, 810, 800, 812, 874, 789, 831, 779, 964, 958, 838, 800, 702, 739, 929, 855, 810, 869, 725, 865, 904, 865, 676, 778, 812, 847, 804, 871, 758, 886, 944, 782, 841, 738, 998, 847, 807, 917, 708, 837, 802, 833, 950, 863, 753, 913, 854, 680, 986, 922, 871, 668, 836, 684, 730, 790, 807, 885, 884, 847, 886, 827, 903, 680, 761, 813, 962, 716, 673, 839, 793, 804, 838, 722, 841, 954)
    const val weightMax5 = 9997
}