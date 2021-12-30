public class BonusMilesService {
    int calculate(int cost) {
        int rublesStep = 20;          // кол-во рублей,за которые начислят одну милю
        return cost / rublesStep;     // Количество начисленных миль
    }
}
