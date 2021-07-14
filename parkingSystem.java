class ParkingSystem {
    int _big;
    int _medium;
    int _small;
    
    public ParkingSystem(int big, int medium, int small) {
        _big = big;
        _medium = medium;
        _small = small;
    }
    
    public boolean addCar(int carType) 
    {
        switch(carType)
        {
            case 1:
            {
                if (_big>=1)
                {
                    _big--;
                    return true;
                }
                return false;
            }
            case 2:
            {
                if (_medium>=1)
                {
                    _medium--;
                    return true;
                }
                return false;
            }
            case 3:
            {
                if (_small>=1)
                {
                    _small--;
                    return true;
                }
                return false;
            }
        }
    return false;
    }
}